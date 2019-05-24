package pl.edu.agh.bioauth.internal.biometrics.common.preprocess.photo

import pl.edu.agh.bioauth.internal.biometrics.common.exception.LivenessException
import pl.edu.agh.bioauth.internal.biometrics.common.preprocess.SamplesProcessor
import pl.edu.agh.bioauth.internal.biometrics.common.preprocess.photo.liveness.PhotoLivenessDetector
import java.io.File

internal class PhotoProcessor(livenessDetector: PhotoLivenessDetector) : SamplesProcessor<PhotoLivenessDetector>(livenessDetector) {

    @Throws(LivenessException::class)
    override fun preprocess(samples: List<File>): List<File> = setupLivenessTest(samples)

}