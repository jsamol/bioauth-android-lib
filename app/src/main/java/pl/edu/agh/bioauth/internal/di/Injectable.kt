package pl.edu.agh.bioauth.internal.di

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KType

internal interface Injectable {
    fun <R, T> inject(kType: KType? = null, init: (T.() -> Unit)? = null): ReadOnlyProperty<R, T> = DependencyProvider.inject(kType, init)
    fun initDependencies() = DependencyProvider.initComponent(this)
    fun cleanDependencies() = DependencyProvider.cleanComponent(this)
}