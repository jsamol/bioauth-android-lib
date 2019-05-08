package pl.edu.agh.bioauth.internal.di.module

import pl.edu.agh.bioauth.internal.di.property.InjectableProperty
import kotlin.reflect.KType
import kotlin.reflect.KVisibility
import kotlin.reflect.full.memberProperties

internal abstract class AbstractModule {
    val dependencies: Map<KType, List<InjectableProperty<*>>> =
        this.javaClass.kotlin.memberProperties
            .filter { it.visibility == KVisibility.PUBLIC && it.name != this::dependencies.name}
            .asSequence()
            .groupBy({ it.returnType }, { InjectableProperty(it, this) })
            .toMap()
}