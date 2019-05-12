package pl.edu.agh.bioauth.internal.biometrics.facerecognition.callback

import android.hardware.camera2.CameraCaptureSession

internal class FaceCaptureSessionCallback : CameraCaptureSession.StateCallback() {

    private lateinit var _onConfigureFailed: () -> Unit
    private lateinit var _onConfigured: (CameraCaptureSession) -> Unit

    override fun onConfigureFailed(session: CameraCaptureSession) = _onConfigureFailed()

    override fun onConfigured(session: CameraCaptureSession) = _onConfigured(session)

    fun initCallbacks(onConfigured: (CameraCaptureSession) -> Unit, onConfigureFailed: () -> Unit) {
        _onConfigured = onConfigured
        _onConfigureFailed = onConfigureFailed
    }
}