package pl.edu.agh.bioauth.internal.di.annotation

import kotlin.reflect.KClass

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
internal annotation class FactoryReturn(val type: KClass<*>)