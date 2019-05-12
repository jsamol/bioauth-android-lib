package pl.edu.agh.bioauth.internal.di.module.common

import pl.edu.agh.bioauth.internal.biometrics.common.photo.liveness.PhotoLivenessDetector
import pl.edu.agh.bioauth.internal.biometrics.common.photo.PhotoProcessor
import pl.edu.agh.bioauth.internal.di.module.AbstractModule

internal class PhotoModule : AbstractModule() {

    private val livenessDetector: PhotoLivenessDetector =
        PhotoLivenessDetector()

    val photoProcessor: PhotoProcessor = PhotoProcessor(livenessDetector)
}