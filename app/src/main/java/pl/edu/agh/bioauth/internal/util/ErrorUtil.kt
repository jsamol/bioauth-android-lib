package pl.edu.agh.bioauth.internal.util

import pl.edu.agh.bioauth.internal.exception.InjectionException
import java.lang.IllegalStateException

object ErrorUtil {

    private const val INJECTION_UNKNOWN_REQUESTED_TYPE = "Could not find the requested type"
    private const val INJECTION_MULTIPLE_REQUESTED_TYPES = "Multiple properties of the same type"
    private const val INJECTION_UNKNOWN_REQUESTED_PROPERTY = "Could not find the requested property"

    fun failWithUnknownInjectingType(): Nothing = throw InjectionException(INJECTION_UNKNOWN_REQUESTED_TYPE)

    fun failWithMultipleInjectingTypes(): Nothing = throw InjectionException(INJECTION_MULTIPLE_REQUESTED_TYPES)

    fun failWithUnknownInjectingProperty(): Nothing = throw InjectionException(INJECTION_UNKNOWN_REQUESTED_PROPERTY)

    fun failWithIllegalState(): Nothing = throw IllegalStateException()
}