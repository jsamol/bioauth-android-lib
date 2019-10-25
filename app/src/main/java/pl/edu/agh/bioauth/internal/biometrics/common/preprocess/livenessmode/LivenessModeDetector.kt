package pl.edu.agh.bioauth.internal.biometrics.common.preprocess.livenessmode

import pl.edu.agh.bioauth.auth.LivenessMode
import pl.edu.agh.bioauth.internal.util.BatteryUtil
import pl.edu.agh.bioauth.internal.util.ConnectionUtil
import pl.edu.agh.bioauth.internal.util.PerformanceUtil
import pl.edu.agh.bioauth.internal.util.extension.*
import pl.edu.agh.bioauth.internal.util.extension.mapWithPrevious
import pl.edu.agh.bioauth.internal.util.extension.toInt

internal class LivenessModeDetector(
    private val batteryUtil: BatteryUtil,
    private val connectionUtil: ConnectionUtil,
    private val performanceUtil: PerformanceUtil
) {
    fun detect(sampleSize: Long): LivenessMode {
        val features = listOf(
            discretizeBatteryLevel(batteryUtil.batteryLevel),
            discretizeChargeCounter(batteryUtil.chargeCounter),
            batteryUtil.chargeType,
            connectionUtil.connectionType,
            discretizeMemory(performanceUtil.availableOsMemory),
            discretizeMemory(performanceUtil.availableAppMemory),
            performanceUtil.lowMemory.toInt(),
            discretizeTime(performanceUtil.startupCpuTime),
            discretizeSize(sampleSize)
        ).map { it.toDouble() }.toDoubleArray()

        val livenessModeClass = LivenessModeClassifier.predict(features)

        return LivenessMode.getMode(livenessModeClass)
    }

    private fun discretizeBatteryLevel(level: Float): Int {
        val sizes = listOf(0.05f) * 4 + listOf(0.2f) * 4
        return discretize(level, 0.0f, 1.0f, sizes)
    }

    private fun discretizeChargeCounter(chargeCounter: Long): Int {
        val sizes = listOf(100_000L) * 500
        return discretize(chargeCounter, 0L, 50_000_000L, sizes)
    }

    private fun discretizeMemory(memory: Long): Int {
        val sizes = listOf(200L) * 5 + listOf(500L) * 2
        return discretize(memory, 0L, 2_000L, sizes)
    }

    private fun discretizeTime(time: Long): Int {
        val sizes = listOf(500L) * 4
        return discretize(time, 0L, 2_000L, sizes)
    }

    private fun discretizeSize(size: Long): Int {
        val sizes = listOf(100_000L) * 10
        return discretize(size, 0L, 1_000_000L, sizes)
    }

    private fun <T> discretize(value: T, minValue: T, maxValue: T, binSizes: List<T>): Int
        where T : Number,
              T : Comparable<T> {
        val boundaries = binSizes.mapWithPrevious { prev, size -> min(maxValue, (prev ?: minValue) + size) }
        return boundaries.indexOfFirstOrNull { value <= it } ?: boundaries.lastIndex
    }
}