package pl.edu.agh.bioauth.internal.biometrics.common.preprocess.photo

import pl.edu.agh.bioauth.internal.biometrics.common.exception.LivenessException
import pl.edu.agh.bioauth.internal.biometrics.common.preprocess.SamplesProcessor
import pl.edu.agh.bioauth.internal.biometrics.common.preprocess.livenessmode.LivenessModeDetector
import pl.edu.agh.bioauth.internal.biometrics.common.preprocess.photo.liveness.PhotoLivenessDetector
import java.io.File

internal class PhotoProcessor(
    livenessDetector: PhotoLivenessDetector,
    livenessModeDetector: LivenessModeDetector
) : SamplesProcessor<PhotoLivenessDetector>(livenessDetector, livenessModeDetector) {

    @Throws(LivenessException::class)
    override fun preprocess(samples: List<File>): List<File> = testLiveness(samples)

}