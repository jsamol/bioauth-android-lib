package pl.edu.agh.bioauth.internal.di

import kotlin.properties.ReadOnlyProperty

internal interface Injectable {
    fun <R, T> inject(init: (T.() -> Unit)? = null): ReadOnlyProperty<R, T> = DependencyProvider.inject(init)
    fun initDependencies() = DependencyProvider.initComponent(this)
    fun cleanDependencies() = DependencyProvider.cleanComponent(this)
}