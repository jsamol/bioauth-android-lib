package pl.edu.agh.bioauth.internal.di.module

import pl.edu.agh.bioauth.internal.di.annotation.Factory
import pl.edu.agh.bioauth.internal.di.annotation.FactoryReturn
import pl.edu.agh.bioauth.internal.di.field.InjectableProperty
import pl.edu.agh.bioauth.internal.di.field.InjectablePropertyFactory
import pl.edu.agh.bioauth.internal.util.extension.kClass
import kotlin.reflect.KClass
import kotlin.reflect.KVisibility
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

internal abstract class AbstractModule {
    private val publicMembers = this.javaClass.kotlin.memberProperties.filter {
        it.visibility == KVisibility.PUBLIC && it.name != this::dependencies.name && it.name != this::factories.name
    }

    val dependencies: Map<KClass<*>, List<InjectableProperty<*>>> =
        publicMembers
            .filter { it.findAnnotation<Factory>() == null }
            .asSequence()
            .groupBy({ it.kClass }, { InjectableProperty(it, this) })

    val factories: Map<KClass<*>, List<InjectablePropertyFactory<*>>> =
        publicMembers
            .filter { it.findAnnotation<Factory>() != null }
            .asSequence()
            .groupBy(
                { it.kClass.findAnnotation<FactoryReturn>()?.type ?: Nothing::class },
                { InjectablePropertyFactory(it, this) }
            )
            .filterKeys { it != Nothing::class }
}