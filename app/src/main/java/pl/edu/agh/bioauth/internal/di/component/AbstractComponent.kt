package pl.edu.agh.bioauth.internal.di.component

import pl.edu.agh.bioauth.internal.di.annotation.Component
import pl.edu.agh.bioauth.internal.di.module.AbstractModule
import pl.edu.agh.bioauth.internal.di.property.InjectableProperty
import kotlin.reflect.KClass
import kotlin.reflect.KType

internal abstract class AbstractComponent {
    private val modules: List<Class<out AbstractModule>> =
        this::class.java.annotations
            .mapNotNull { it as? Component }
            .asSequence()
            .flatMap { it.modules.asSequence() }
            .map { it.java }
            .toList()

    val dependencies: Map<KType, List<InjectableProperty<*>>> =
        modules.map(Class<out AbstractModule>::newInstance)
            .map { it.dependencies }
            .asSequence()
            .flatMap { it.asSequence() }
            .groupBy({ it.key }, { it.value })
            .mapValues { it.value.flatten() }
            .toMap()
}