package pl.edu.agh.bioauth.internal.di.field

import pl.edu.agh.bioauth.internal.di.annotation.Named
import kotlin.reflect.KProperty
import kotlin.reflect.full.findAnnotation

internal abstract class InjectableField<T>(property: KProperty<T>, target: Any) {
    val value: T by lazy {  property.getter.call(target) }

    val name: String? = property.findAnnotation<Named>()?.value
}