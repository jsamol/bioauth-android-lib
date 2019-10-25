package pl.edu.agh.bioauth.internal.biometrics.common.preprocess

import java.io.File

internal abstract class LivenessDetector {
    abstract fun testLiveness(samples: List<File>): Boolean
}