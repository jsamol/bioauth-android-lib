package pl.edu.agh.bioauth.internal.biometrics.common.photo

import pl.edu.agh.bioauth.auth.LivenessMode
import pl.edu.agh.bioauth.auth.LivenessMode.*
import pl.edu.agh.bioauth.internal.biometrics.common.exception.LivenessException
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import pl.edu.agh.bioauth.internal.util.ErrorUtil
import pl.edu.agh.bioauth.internal.util.FileUtil
import java.io.File

internal class PhotoProcessor(private val livenessDetector: PhotoLivenessDetector) {

    lateinit var biometricsType: BiometricsType
    lateinit var livenessMode: LivenessMode

    @Throws(LivenessException::class)
    fun preprocessPhotos(photos: List<File>): List<File> {
        val markedPhotos = when (livenessMode) {
            MOBILE -> {
                if (livenessDetector.testLiveness(photos)) {
                    markPhotosLivenessStatus(photos, true)
                } else {
                    ErrorUtil.failWithLivenessTestFailed()
                }
            }
            SERVER -> markPhotosLivenessStatus(photos, null)
            MACHINE_LEARNING -> markPhotosLivenessStatus(photos, null)
        }
        return markedPhotos
    }

    private fun markPhotosLivenessStatus(photos: List<File>, status: Boolean?): List<File> {
        val metadata = mapOf(METADATA_LIVENESS_STATUS to status)
        val metadataFile = FileUtil.createMetadataTempFile(biometricsType, metadata)

        return photos + metadataFile
    }

    companion object {
        private const val METADATA_LIVENESS_STATUS = "livenessStatus"
    }
}