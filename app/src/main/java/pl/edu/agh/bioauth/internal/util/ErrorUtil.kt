package pl.edu.agh.bioauth.internal.util

import pl.edu.agh.bioauth.exception.CameraException
import pl.edu.agh.bioauth.exception.SdkUninitializedException
import pl.edu.agh.bioauth.internal.biometrics.common.exception.LivenessException
import pl.edu.agh.bioauth.internal.exception.InjectionException
import java.lang.Exception
import java.lang.IllegalStateException
import java.lang.RuntimeException

private typealias ThrowableHandler<T> = (T) -> Unit
private typealias CameraExceptionHandler = ThrowableHandler<CameraException>

internal object ErrorUtil {

    private const val INJECTION_UNKNOWN_REQUESTED_TYPE = "Could not find the requested type."
    private const val INJECTION_MULTIPLE_REQUESTED_TYPES = "Multiple properties of the same type."
    private const val INJECTION_UNKNOWN_REQUESTED_PROPERTY = "Could not find the requested property."

    private const val LIVENESS_TEST_FAILED = "Sample did not passed the liveness test."

    private const val CAMERA_TIMEOUT_OPENING = "Time out waiting to lock camera opening."
    private const val CAMERA_INTERRUPTED_OPENING = "Interrupted while trying to lock camera opening."
    private const val CAMERA_INTERRUPTED_CLOSING = "Interrupted while trying to lock camera closing."
    private const val CAMERA_PERMISSION_DENIED = "Could not open the camera. Camera permission has been denied."
    private const val CAMERA_API_NOT_SUPPORTED = "Camera2 API is not supported on this device."

    private const val RUNTIME_UNKNOWN_NUMERIC_TYPE = "Unknown numeric type."

    fun failWithSdkUninitialized(): Nothing = throw SdkUninitializedException()

    fun failWithUnknownInjectingType(): Nothing = throw InjectionException(INJECTION_UNKNOWN_REQUESTED_TYPE)

    fun failWithMultipleInjectingTypes(): Nothing = throw InjectionException(INJECTION_MULTIPLE_REQUESTED_TYPES)

    fun failWithUnknownInjectingProperty(): Nothing = throw InjectionException(INJECTION_UNKNOWN_REQUESTED_PROPERTY)

    fun failWithCameraTimeoutOpening(): Nothing = throw RuntimeException(CAMERA_TIMEOUT_OPENING)

    fun failWithCameraInterruptedOpening(cause: Exception? = null): Nothing = throw RuntimeException(CAMERA_INTERRUPTED_OPENING, cause)

    fun failWithCameraInterruptedClosing(cause: Exception? = null): Nothing = throw RuntimeException(CAMERA_INTERRUPTED_CLOSING, cause)

    fun failWithIllegalState(): Nothing = throw IllegalStateException()

    fun failWithUnknownNumericType(): Nothing = throw RuntimeException(RUNTIME_UNKNOWN_NUMERIC_TYPE)

    fun failWithLivenessTestFailed(): Nothing = throw LivenessException(LIVENESS_TEST_FAILED)

    fun failWithCameraError(cause: Exception? = null): Nothing = throw CameraException(cause = cause)

    fun failWithCameraError(handler: CameraExceptionHandler, cause: Exception? = null) =
        failWithCatchableError(CameraException(cause = cause), handler)

    fun failWithCameraPermissionDenied(handler: CameraExceptionHandler) =
        failWithCatchableError(CameraException(CAMERA_PERMISSION_DENIED), handler)

    fun failWithCameraApiNotSupported(handler: CameraExceptionHandler) =
        failWithCatchableError(CameraException(CAMERA_API_NOT_SUPPORTED), handler)

    private fun <T : Throwable> failWithCatchableError(throwable: T, handler: ThrowableHandler<T>) = handler(throwable)
}