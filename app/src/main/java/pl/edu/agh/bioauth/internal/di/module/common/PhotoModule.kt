package pl.edu.agh.bioauth.internal.di.module.common

import pl.edu.agh.bioauth.internal.biometrics.common.preprocess.livenessmode.LivenessModeDetector
import pl.edu.agh.bioauth.internal.biometrics.common.preprocess.photo.liveness.PhotoLivenessDetector
import pl.edu.agh.bioauth.internal.biometrics.common.preprocess.photo.PhotoProcessor
import pl.edu.agh.bioauth.internal.di.module.AbstractModule
import pl.edu.agh.bioauth.internal.util.BatteryUtil
import pl.edu.agh.bioauth.internal.util.ConnectionUtil
import pl.edu.agh.bioauth.internal.util.PerformanceUtil

internal class PhotoModule : AbstractModule() {

    private val livenessDetector: PhotoLivenessDetector
        get() = PhotoLivenessDetector()

    private val batteryUtil: BatteryUtil
        get() = BatteryUtil()

    private val connectionUtil: ConnectionUtil
        get() = ConnectionUtil()

    private val performanceUtil: PerformanceUtil
        get() = PerformanceUtil()

    private val livenessModeDetector: LivenessModeDetector
        get() = LivenessModeDetector(batteryUtil, connectionUtil, performanceUtil)

    val photoProcessor: PhotoProcessor = PhotoProcessor(livenessDetector, livenessModeDetector)
}