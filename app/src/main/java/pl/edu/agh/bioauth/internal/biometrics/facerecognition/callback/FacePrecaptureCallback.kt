package pl.edu.agh.bioauth.internal.biometrics.facerecognition.callback

import android.hardware.camera2.CameraCaptureSession
import android.hardware.camera2.CaptureRequest
import android.hardware.camera2.CaptureResult
import android.hardware.camera2.TotalCaptureResult

internal class FacePrecaptureCallback : CameraCaptureSession.CaptureCallback() {

    lateinit var processCaptureResult: (CaptureResult) -> Unit

    override fun onCaptureCompleted(session: CameraCaptureSession, request: CaptureRequest, result: TotalCaptureResult) =
        processCaptureResult(result)

    override fun onCaptureProgressed(session: CameraCaptureSession, request: CaptureRequest, partialResult: CaptureResult) =
        processCaptureResult(partialResult)
}