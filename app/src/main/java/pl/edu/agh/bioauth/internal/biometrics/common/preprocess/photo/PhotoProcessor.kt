package pl.edu.agh.bioauth.internal.biometrics.common.preprocess.photo

import pl.edu.agh.bioauth.auth.LivenessMode.*
import pl.edu.agh.bioauth.internal.biometrics.common.exception.LivenessException
import pl.edu.agh.bioauth.internal.biometrics.common.preprocess.SamplesProcessor
import pl.edu.agh.bioauth.internal.biometrics.common.preprocess.photo.liveness.PhotoLivenessDetector
import pl.edu.agh.bioauth.internal.util.ErrorUtil
import pl.edu.agh.bioauth.internal.util.FileUtil
import java.io.File

internal class PhotoProcessor(livenessDetector: PhotoLivenessDetector) : SamplesProcessor<PhotoLivenessDetector>(livenessDetector) {

    @Throws(LivenessException::class)
    override fun preprocess(samples: List<File>): List<File> {
        val markedPhotos = when (livenessMode) {
            MOBILE -> {
                if (livenessDetector.testLiveness(samples)) {
                    markPhotosLivenessStatus(samples, true).takeLast(2)
                } else {
                    ErrorUtil.failWithLivenessTestFailed()
                }
            }
            SERVER -> markPhotosLivenessStatus(samples, null)
            MACHINE_LEARNING -> markPhotosLivenessStatus(samples, null)
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