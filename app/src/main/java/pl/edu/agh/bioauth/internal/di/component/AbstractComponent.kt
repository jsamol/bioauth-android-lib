package pl.edu.agh.bioauth.internal.di.component

import pl.edu.agh.bioauth.internal.di.annotation.Component
import pl.edu.agh.bioauth.internal.di.module.AbstractModule
import pl.edu.agh.bioauth.internal.di.field.InjectablePropertyFactory
import pl.edu.agh.bioauth.internal.di.field.InjectableProperty
import pl.edu.agh.bioauth.internal.util.extension.flattenMapList
import kotlin.reflect.KClass
import kotlin.reflect.KType

internal abstract class AbstractComponent {
    private val modules: List<AbstractModule> =
        this::class.java.annotations
            .mapNotNull { it as? Component }
            .asSequence()
            .flatMap { it.modules.asSequence() }
            .map { it.java.newInstance() }
            .toList()

    val dependencies: Map<KClass<*>, List<InjectableProperty<*>>> =
        modules.map { it.dependencies }.flattenMapList()

    val factories: Map<KClass<*>, List<InjectablePropertyFactory<*>>> =
        modules.map { it.factories }.flattenMapList()
}