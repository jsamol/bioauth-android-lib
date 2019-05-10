package pl.edu.agh.bioauth.internal.biometrics.facerecognition.ui

import pl.edu.agh.bioauth.exception.CameraException
import pl.edu.agh.bioauth.internal.base.BaseViewModel
import pl.edu.agh.bioauth.internal.biometrics.common.MethodType
import pl.edu.agh.bioauth.internal.biometrics.facerecognition.CameraCaptureState
import pl.edu.agh.bioauth.internal.biometrics.facerecognition.CameraCaptureState.PREVIEW
import java.io.File

internal class FaceRecognitionViewModel : BaseViewModel() {

    val photos: MutableList<File> = mutableListOf()
    val hasNotEnoughPhotos: Boolean
        get() = photos.size < PHOTOS_REQUIRED_NUMBER

    var method: MethodType<*>? = null

    var cameraCaptureState: CameraCaptureState = PREVIEW

    fun processPhotos() {

    }

    fun onCameraError(cameraException: CameraException) {
        method?.listener?.onFailure(cameraException)
    }

    companion object {
        private const val PHOTOS_REQUIRED_NUMBER = 7
    }
}