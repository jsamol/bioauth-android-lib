package pl.edu.agh.bioauth.internal.biometrics.common.photo

import java.io.File

internal class PhotoProcessor(private val livenessDetector: PhotoLivenessDetector) {

    fun preprocessPhotos(photos: List<File>): List<File> = photos
}