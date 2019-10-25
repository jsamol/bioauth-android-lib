package pl.edu.agh.bioauth.internal.util

import android.app.ActivityManager
import android.content.Context
import pl.edu.agh.bioauth.BioAuth
import pl.edu.agh.bioauth.exception.SdkUninitializedException
import retrofit2.Converter

internal class PerformanceUtil {
    @get:Throws(SdkUninitializedException::class)
    private val applicationContext: Context
        get() = BioAuth.instance?.applicationContext ?: ErrorUtil.failWithSdkUninitialized()

    private val activityManager: ActivityManager? by lazy {
        applicationContext.getSystemService(Context.ACTIVITY_SERVICE) as? ActivityManager
    }

    val startupCpuTime: Long
        get() = BioAuth.instance?.startupCpuTime ?: ErrorUtil.failWithSdkUninitialized()

    val availableOsMemory: Long
        get() = fromBytesToMebiBytes(ActivityManager.MemoryInfo().apply {
            activityManager?.getMemoryInfo(this)
        }.availMem)

    val availableAppMemory: Long
        get() = fromBytesToMebiBytes(Runtime.getRuntime().run {
            val usedMemory = totalMemory() - freeMemory()
            maxMemory() - usedMemory
        })

    val lowMemory: Boolean
        get() = ActivityManager.MemoryInfo().apply { activityManager?.getMemoryInfo(this) }.lowMemory


    private fun fromBytesToMebiBytes(bytes: Long): Long = bytes / MEBI_BYTES

    companion object {
        private const val MEBI_BYTES = 0x100000
    }
}