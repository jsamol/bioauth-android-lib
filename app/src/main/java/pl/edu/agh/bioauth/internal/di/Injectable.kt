package pl.edu.agh.bioauth.internal.di

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KClass

internal interface Injectable {
    fun <R, T: Any> inject(kClass: KClass<T>? = null, init: T.() -> Unit = {}): ReadOnlyProperty<R, T> = DependencyProvider.inject(kClass, init)
    fun <R, T: Any, S> factory(selector: () -> S?, init: T.() -> Unit = {}): ReadOnlyProperty<R, T?> = DependencyProvider.factory(selector, init)
    fun initDependencies() = DependencyProvider.initComponent(this)
    fun cleanDependencies() = DependencyProvider.cleanComponent(this)
}