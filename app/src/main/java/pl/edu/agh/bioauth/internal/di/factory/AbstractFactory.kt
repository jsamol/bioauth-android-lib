package pl.edu.agh.bioauth.internal.di.factory

import kotlin.reflect.KClass

internal abstract class AbstractFactory<S, T: Any> {
    abstract fun create(selector: S): T
}