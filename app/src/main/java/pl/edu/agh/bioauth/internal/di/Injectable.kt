package pl.edu.agh.bioauth.internal.di

import kotlin.properties.ReadOnlyProperty

internal interface Injectable {
    fun <R, T> inject(): ReadOnlyProperty<R, T> = DependencyProvider.inject()
    fun initDependencies() = DependencyProvider.initComponent(this)
    fun cleanDependencies() = DependencyProvider.cleanComponent(this)
}