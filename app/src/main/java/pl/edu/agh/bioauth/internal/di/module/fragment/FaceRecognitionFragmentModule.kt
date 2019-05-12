package pl.edu.agh.bioauth.internal.di.module.fragment

import pl.edu.agh.bioauth.internal.biometrics.facerecognition.callback.FaceCameraStateCallback
import pl.edu.agh.bioauth.internal.biometrics.facerecognition.callback.FaceCaptureCallback
import pl.edu.agh.bioauth.internal.biometrics.facerecognition.callback.FaceCaptureSessionCallback
import pl.edu.agh.bioauth.internal.biometrics.facerecognition.callback.FacePrecaptureCallback
import pl.edu.agh.bioauth.internal.biometrics.facerecognition.listener.FaceOnImageAvailableListener
import pl.edu.agh.bioauth.internal.biometrics.facerecognition.listener.FaceSurfaceTextureListener
import pl.edu.agh.bioauth.internal.di.module.AbstractModule

internal class FaceRecognitionFragmentModule : AbstractModule() {
    val onImageAvailableListener: FaceOnImageAvailableListener
        get() = FaceOnImageAvailableListener()

    val surfaceTextureListener: FaceSurfaceTextureListener
        get() = FaceSurfaceTextureListener()

    val cameraStateCallback: FaceCameraStateCallback
        get() = FaceCameraStateCallback()

    val captureSessionCallback: FaceCaptureSessionCallback
        get() = FaceCaptureSessionCallback()

    val precaptureCallback: FacePrecaptureCallback
        get() = FacePrecaptureCallback()

    val captureCallback: FaceCaptureCallback
        get() = FaceCaptureCallback()
}