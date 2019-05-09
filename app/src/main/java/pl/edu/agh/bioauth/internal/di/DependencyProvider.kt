package pl.edu.agh.bioauth.internal.di

import android.app.Activity
import android.app.Application
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import pl.edu.agh.bioauth.internal.di.annotation.Component
import pl.edu.agh.bioauth.internal.di.annotation.Named
import pl.edu.agh.bioauth.internal.di.annotation.Provider
import pl.edu.agh.bioauth.internal.di.component.AbstractComponent
import pl.edu.agh.bioauth.internal.di.component.AppComponent
import pl.edu.agh.bioauth.internal.exception.InjectionException
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KClass
import kotlin.reflect.KProperty
import kotlin.reflect.full.findAnnotation

@Provider(components = [AppComponent::class])
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

    fun <R, T> inject(): ReadOnlyProperty<R, T> = object : ReadOnlyProperty<R, T> {
        override fun getValue(thisRef: R, property: KProperty<*>): T {
            val appDependencies = appComponent?.dependencies ?: emptyMap()
            val dependencies = when (thisRef) {
                is ViewModel -> {
                    val viewModelDependencies = viewModelComponents[thisRef]?.dependencies ?: emptyMap()
                    appDependencies + viewModelDependencies
                }
                is Fragment -> {
                    val fragmentDependencies = fragmentComponents[thisRef]?.dependencies ?: emptyMap()
                    val activityDependencies = activityComponents[thisRef.requireActivity()]?.dependencies ?: emptyMap()
                    appDependencies + activityDependencies + fragmentDependencies
                }
                is Activity -> {
                    val activityDependencies = activityComponents[thisRef]?.dependencies ?: emptyMap()
                    appDependencies + activityDependencies
                }
                else -> appDependencies
            }

            val injectableProperties = dependencies[property.returnType]
                ?: throw InjectionException("Could not find the requested type")

            val propertyName = property.findAnnotation<Named>()?.value

            if (injectableProperties.size > 1) {
                propertyName ?: throw InjectionException("Multiple properties of the same type")
            }

            return (injectableProperties.firstOrNull { it.name == propertyName }?.value as? T)
                ?: throw InjectionException("Could not find the requested property")
        }
    }
}