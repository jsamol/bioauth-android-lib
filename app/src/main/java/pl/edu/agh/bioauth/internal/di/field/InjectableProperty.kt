package pl.edu.agh.bioauth.internal.di.field

import kotlin.reflect.KProperty

internal class InjectableProperty<T>(property: KProperty<T>, target: Any) : InjectableField<T>(property, target)