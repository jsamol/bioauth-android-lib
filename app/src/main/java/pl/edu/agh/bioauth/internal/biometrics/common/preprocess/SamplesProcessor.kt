package pl.edu.agh.bioauth.internal.biometrics.common.preprocess

import pl.edu.agh.bioauth.auth.LivenessMode
import pl.edu.agh.bioauth.auth.LivenessMode.*
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import pl.edu.agh.bioauth.internal.util.ErrorUtil
import pl.edu.agh.bioauth.internal.util.FileUtil
import java.io.File

internal abstract class SamplesProcessor<T: LivenessDetector>(protected val livenessDetector: T) {
    lateinit var biometricsType: BiometricsType
    lateinit var livenessMode: LivenessMode

    abstract fun preprocessSamples(samples: List<File>): List<File>

    protected fun setupLivenessTest(samples: List<File>): List<File> =
        when (livenessMode) {
            MOBILE -> {
                if (livenessDetector.testLiveness(samples)) {
                    markFilesLivenessStatus(samples, true).takeLast(2)
                } else {
                    ErrorUtil.failWithLivenessTestFailed()
                }
            }
            SERVER -> markFilesLivenessStatus(samples, null)
            MACHINE_LEARNING -> markFilesLivenessStatus(samples, null)
        }

    private fun markFilesLivenessStatus(files: List<File>, status: Boolean?): List<File> {
        val metadata = mapOf(METADATA_LIVENESS_STATUS to status)
        val metadataFile = FileUtil.createMetadataTempFile(biometricsType, metadata)

        return files + metadataFile
    }

    companion object {
        private const val METADATA_LIVENESS_STATUS = "livenessStatus"
    }
}