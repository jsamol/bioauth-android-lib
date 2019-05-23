package pl.edu.agh.bioauth.internal.util.extension

import kotlin.reflect.KClass
import kotlin.reflect.KProperty
import kotlin.reflect.jvm.jvmErasure

internal val <R> KProperty<R>.kClass: KClass<*>
    get() = returnType.jvmErasure