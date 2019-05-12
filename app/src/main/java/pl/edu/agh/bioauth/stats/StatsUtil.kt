package pl.edu.agh.bioauth.stats

import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.BatteryManager
import pl.edu.agh.bioauth.BioAuth
import pl.edu.agh.bioauth.exception.SdkUninitializedException
import pl.edu.agh.bioauth.internal.di.DependencyProvider
import pl.edu.agh.bioauth.internal.network.ApiController
import pl.edu.agh.bioauth.internal.network.callback.VoidCallback
import pl.edu.agh.bioauth.internal.util.ErrorUtil
import pl.edu.agh.bioauth.internal.util.extension.round
import pl.edu.agh.bioauth.stats.data.BatteryData
import pl.edu.agh.bioauth.stats.data.InitialData
import pl.edu.agh.bioauth.stats.data.MemoryData
import pl.edu.agh.bioauth.stats.data.StatsData

object StatsUtil {

    private val apiController: ApiController by DependencyProvider.inject()

    private val voidCallback: VoidCallback by DependencyProvider.inject()

    @get:Throws(SdkUninitializedException::class)
    private val applicationContext: Context
        get() = BioAuth.instance?.applicationContext ?: ErrorUtil.failWithSdkUninitialized()

    private val batteryStatusIntent: Intent? by lazy {
        IntentFilter(Intent.ACTION_BATTERY_CHANGED).let { applicationContext.registerReceiver(null, it) }
    }

    private val connectivityManager: ConnectivityManager? by lazy {
        applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as? ConnectivityManager
    }

    private val activityManager: ActivityManager? by lazy {
        applicationContext.getSystemService(Context.ACTIVITY_SERVICE) as? ActivityManager
    }

    private var initialData: InitialData? = null

    private var start: Long = 0
    private var end: Long = 0

    private val totalTime: Long
        get() = end - start

    private val batteryData: BatteryData
        get() {
            val batteryLevel = batteryStatusIntent?.let {
                val level = it.getIntExtra(BatteryManager.EXTRA_LEVEL, -1)
                val scale = it.getIntExtra(BatteryManager.EXTRA_SCALE, -1)

                level.toFloat() / scale.toFloat()
            } ?: -1.0f

            val batteryStatus = batteryStatusIntent?.getIntExtra(BatteryManager.EXTRA_STATUS, -1) ?: -1
            val isCharging = (batteryStatus == BatteryManager.BATTERY_STATUS_CHARGING)
                    || (batteryStatus == BatteryManager.BATTERY_STATUS_FULL)

            val chargeType = batteryStatusIntent?.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1) ?: -1

            return BatteryData(batteryLevel, isCharging, chargeType)
        }

    private val connectionType: Int
        get() {
            val network = connectivityManager?.activeNetwork
            val networkInfo = connectivityManager?.activeNetworkInfo
            val capabilities = connectivityManager?.getNetworkCapabilities(network)

            if (networkInfo?.isConnected == true) {
                return capabilities?.let {
                    when {
                        it.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> 0
                        it.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> networkInfo.subtype + 1
                        else -> null
                    }
                } ?: -1
            }

            return -1
        }

    private val memoryData: MemoryData
        get() = ActivityManager.MemoryInfo().run {
            activityManager?.getMemoryInfo(this)
            val availableMemory = (availMem.toFloat() / totalMem.toFloat()).round(1)

            return MemoryData(availableMemory, lowMemory)
        }

    fun onStart() {
        initialData = InitialData(batteryData, connectionType, memoryData)
        start = System.currentTimeMillis()
    }

    fun onEnd() {
        end = System.currentTimeMillis()
        initialData?.let {
            val batteryDrain = batteryData.batteryLevel - it.batteryData.batteryLevel
            val statsData = StatsData(it, batteryDrain, totalTime)

            apiController.uploadStatistics(statsData).enqueue(voidCallback)
        }
    }

    fun onFailure() {
        start = 0
        end = 0
        initialData = null
    }
}