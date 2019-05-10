package pl.edu.agh.bioauth.internal.di.module.fragment

import pl.edu.agh.bioauth.internal.biometrics.facerecognition.callback.FaceCameraStateCallback
import pl.edu.agh.bioauth.internal.biometrics.facerecognition.callback.FaceCaptureCallback
import pl.edu.agh.bioauth.internal.biometrics.facerecognition.callback.FaceCaptureSessionCallback
import pl.edu.agh.bioauth.internal.biometrics.facerecognition.callback.FacePrecaptureCallback
import pl.edu.agh.bioauth.internal.biometrics.facerecognition.listener.FaceSurfaceTextureListener
import pl.edu.agh.bioauth.internal.di.module.AbstractModule

internal class FaceRecognitionFragmentModule : AbstractModule() {
    val surfaceTextureListener: FaceSurfaceTextureListener = FaceSurfaceTextureListener()

    val cameraStateCallback: FaceCameraStateCallback = FaceCameraStateCallback()
    val captureSessionCallback: FaceCaptureSessionCallback = FaceCaptureSessionCallback()
    val precaptureCallback: FacePrecaptureCallback = FacePrecaptureCallback()
    val captureCallback: FaceCaptureCallback = FaceCaptureCallback()
}