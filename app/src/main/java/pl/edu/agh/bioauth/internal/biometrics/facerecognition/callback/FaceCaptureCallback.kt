package pl.edu.agh.bioauth.internal.biometrics.facerecognition.callback

import android.hardware.camera2.CameraCaptureSession
import android.hardware.camera2.CaptureRequest
import android.hardware.camera2.TotalCaptureResult

class FaceCaptureCallback : CameraCaptureSession.CaptureCallback() {

    lateinit var onCaptureCompleted: () -> Unit

    override fun onCaptureCompleted(session: CameraCaptureSession, request: CaptureRequest, result: TotalCaptureResult) =
        onCaptureCompleted()
}