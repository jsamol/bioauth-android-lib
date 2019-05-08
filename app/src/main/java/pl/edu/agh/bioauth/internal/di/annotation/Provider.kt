package pl.edu.agh.bioauth.internal.di.annotation

import pl.edu.agh.bioauth.internal.di.component.AbstractComponent
import kotlin.reflect.KClass

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
internal annotation class Provider(val components: Array<KClass<out AbstractComponent>>)