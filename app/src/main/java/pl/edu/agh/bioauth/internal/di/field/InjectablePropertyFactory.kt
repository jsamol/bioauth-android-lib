package pl.edu.agh.bioauth.internal.di.field

import kotlin.reflect.KProperty

internal class InjectablePropertyFactory<T>(property: KProperty<T>, target: Any) : InjectableField<T>(property, target)