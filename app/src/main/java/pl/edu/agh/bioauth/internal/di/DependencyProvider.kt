package pl.edu.agh.bioauth.internal.di

import android.app.Activity
import android.app.Application
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import pl.edu.agh.bioauth.internal.di.annotation.Component
import pl.edu.agh.bioauth.internal.di.annotation.Named
import pl.edu.agh.bioauth.internal.di.annotation.Provider
import pl.edu.agh.bioauth.internal.di.component.AbstractComponent
import pl.edu.agh.bioauth.internal.di.component.app.AppComponent
import pl.edu.agh.bioauth.internal.di.component.fragment.FaceRecognitionFragmentComponent
import pl.edu.agh.bioauth.internal.di.factory.AbstractFactory
import pl.edu.agh.bioauth.internal.di.field.InjectableField
import pl.edu.agh.bioauth.internal.di.field.InjectableProperty
import pl.edu.agh.bioauth.internal.di.field.InjectablePropertyFactory
import pl.edu.agh.bioauth.internal.util.ErrorUtil
import pl.edu.agh.bioauth.internal.util.extension.kClass
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KClass
import kotlin.reflect.KProperty
import kotlin.reflect.full.findAnnotation

@Provider(components = [AppComponent::class, FaceRecognitionFragmentComponent::class])
internal object DependencyProvider {

    private val components: Map<KClass<out Any>, Class<out AbstractComponent>> =
        this::class.java.annotations
            .mapNotNull { it as? Provider }
            .asSequence()
            .flatMap { it.components.asSequence() }
            .map { componentClass ->
                componentClass.annotations.mapNotNull { it as? Component }
                    .asSequence()
                    .flatMap { it.targets.asSequence() }
                    .map { it to componentClass.java }
            }.flatMap { it.asSequence() }
            .toMap()

    private val appComponent: AbstractComponent? by lazy { components[Application::class]?.newInstance() }
    private val activityComponents: MutableMap<in Activity, AbstractComponent> = mutableMapOf()
    private val fragmentComponents: MutableMap<in Fragment, AbstractComponent> = mutableMapOf()
    private val viewModelComponents: MutableMap<in ViewModel, AbstractComponent> = mutableMapOf()

    fun initComponent(target: Any) {
        components[target::class]?.let { componentClass ->
            val targetMap = when (target) {
                is ViewModel -> this::viewModelComponents
                is Fragment -> this::fragmentComponents
                is Activity -> this::activityComponents
                else -> null
            }

            targetMap?.get()?.put(target, componentClass.newInstance())
        }
    }

    fun cleanComponent(target: Any) {
        val targetMap = when (target) {
            is ViewModel -> this::viewModelComponents
            is Fragment -> this::fragmentComponents
            is Activity -> this::activityComponents
            else -> null
        }

        targetMap?.get()?.remove(target)
    }

    fun <R, T: Any> inject(kClass: KClass<T>? = null, init: T.() -> Unit = {}): ReadOnlyProperty<R, T> = object : ReadOnlyProperty<R, T> {

        override fun getValue(thisRef: R, property: KProperty<*>): T {
            val dependencies = getFields(thisRef, InjectableProperty::class)
            val injectableProperty = getInjectableField(kClass ?: property.kClass, property, dependencies)

            return (injectableProperty?.value as? T)?.apply(init) ?: ErrorUtil.failWithUnknownInjectingProperty()
        }
    }

    fun <R, T: Any, S> factory(selector: () -> S?, init: T.() -> Unit = {}): ReadOnlyProperty<R, T?> = object : ReadOnlyProperty<R, T?> {

        private val factorySelector: S?
            get() = selector()

        override fun getValue(thisRef: R, property: KProperty<*>): T? =
            factorySelector?.let {
                val factories = getFields(thisRef, InjectablePropertyFactory::class)
                val injectableFactory = getInjectableField(property.kClass, property, factories)

                return (injectableFactory?.value as? AbstractFactory<S, T>)?.create(it)?.apply(init)
                        ?: ErrorUtil.failWithUnknownInjectingProperty()
            }
    }

    private fun <R, T: InjectableField<*>> getFields(ref: R, fieldsType: KClass<T>): Map<KClass<*>, List<InjectableField<*>>> {
        val componentFields: (AbstractComponent?) -> Map<KClass<*>, List<InjectableField<*>>> = { when (fieldsType) {
            InjectableProperty::class -> it?.dependencies
            InjectablePropertyFactory::class -> it?.factories
            else -> null
        } ?: emptyMap() }

        val appFields = componentFields(appComponent)

        return when (ref) {
            is ViewModel -> {
                val viewModelFields = componentFields(viewModelComponents[ref])
                appFields + viewModelFields
            }
            is Fragment -> {
                val fragmentFields = componentFields(fragmentComponents[ref])
                val activityFields = componentFields(activityComponents[ref.requireActivity()])
                appFields + activityFields + fragmentFields
            }
            is Activity -> {
                val activityFields = componentFields(activityComponents[ref])
                appFields + activityFields
            }
            else -> appFields
        }
    }

    private fun <T: InjectableField<*>> getInjectableField(kClass: KClass<*>, property: KProperty<*>, fields: Map<KClass<*>, List<T>>): T? {
        val injectableFields = fields[kClass] ?: ErrorUtil.failWithUnknownInjectingType()

        val propertyName = property.findAnnotation<Named>()?.value

        if (injectableFields.size > 1) {
            propertyName ?: ErrorUtil.failWithMultipleInjectingTypes()
        }

        return injectableFields.firstOrNull { it.name == propertyName }
    }
}