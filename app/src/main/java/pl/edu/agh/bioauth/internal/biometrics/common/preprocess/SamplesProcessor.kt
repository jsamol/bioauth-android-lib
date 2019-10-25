package pl.edu.agh.bioauth.internal.biometrics.common.preprocess

import pl.edu.agh.bioauth.auth.LivenessMode
import pl.edu.agh.bioauth.auth.LivenessMode.*
import pl.edu.agh.bioauth.internal.biometrics.common.exception.LivenessException
import pl.edu.agh.bioauth.internal.biometrics.common.preprocess.livenessmode.LivenessModeDetector
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import pl.edu.agh.bioauth.internal.util.ErrorUtil
import pl.edu.agh.bioauth.internal.util.FileUtil
import pl.edu.agh.bioauth.internal.util.extension.takeHalf
import java.io.File

internal abstract class SamplesProcessor<T: LivenessDetector>(
    private val livenessDetector: T,
    private val livenessModeDetector: LivenessModeDetector
) {
    lateinit var biometricsType: BiometricsType
    lateinit var livenessMode: LivenessMode

    abstract fun preprocess(samples: List<File>): List<File>

    @Throws(LivenessException::class)
    protected fun testLiveness(samples: List<File>): List<File> {
        val sampleSize = samples.map(File::length).fold(0L, Long::plus)
        return when (livenessMode) {
            MACHINE_LEARNING -> testLiveness(livenessModeDetector.detect(sampleSize), samples)
            else -> testLiveness(livenessMode, samples)
        }
    }

    @Throws(LivenessException::class, IllegalStateException::class)
    private fun testLiveness(livenessMode: LivenessMode, samples: List<File>): List<File> =
        when (livenessMode) {
            MOBILE -> checkLiveness(samples)
            SERVER -> markFilesToBeTested(samples)
            else -> ErrorUtil.failWithIllegalState()
        }

    @Throws(LivenessException::class)
    private fun checkLiveness(samples: List<File>): List<File> =
        if (livenessDetector.testLiveness(samples)) {
            markFilesLivenessStatus(samples.takeHalf(), true)
        } else {
            ErrorUtil.failWithLivenessTestFailed()
        }

    private fun markFilesToBeTested(samples: List<File>): List<File> = markFilesLivenessStatus(samples, null)

    private fun markFilesLivenessStatus(files: List<File>, status: Boolean?): List<File> {
        val metadata = mapOf(METADATA_LIVENESS_STATUS to status)
        val metadataFile = FileUtil.createMetadataTempFile(biometricsType, metadata)

        return files + metadataFile
    }

    companion object {
        private const val METADATA_LIVENESS_STATUS = "livenessStatus"
    }
}