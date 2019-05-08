package pl.edu.agh.bioauth.internal.di.annotation

import pl.edu.agh.bioauth.internal.di.module.AbstractModule
import kotlin.reflect.KClass

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
internal annotation class Component(val targets: Array<KClass<out Any>> = [], val modules: Array<KClass<out AbstractModule>>)