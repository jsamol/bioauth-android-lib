package pl.edu.agh.bioauth.internal.biometrics.facerecognition.ui

import pl.edu.agh.bioauth.exception.CameraException
import pl.edu.agh.bioauth.internal.base.BaseViewModel
import pl.edu.agh.bioauth.internal.biometrics.common.preprocess.photo.PhotoProcessor
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import pl.edu.agh.bioauth.internal.biometrics.facerecognition.CameraCaptureState
import pl.edu.agh.bioauth.internal.biometrics.facerecognition.CameraCaptureState.PREVIEW
import java.io.File

internal class FaceRecognitionViewModel : BaseViewModel<PhotoProcessor>(PhotoProcessor::class) {

    override val biometricsType: BiometricsType by inject()

    val photos: MutableList<File> = mutableListOf()
    val hasNotEnoughPhotos: Boolean
        get() = photos.size < PHOTOS_REQUIRED_NUMBER

    var cameraCaptureState: CameraCaptureState = PREVIEW

        @Throws(IllegalStateException::class)
    fun processPhotos() {
        processSamples(photos)
    }

    fun onCameraError(cameraException: CameraException) {
        method?.listener?.onFailure(cameraException)
    }

    companion object {
        const val PHOTOS_REQUIRED_NUMBER = 21
    }
}