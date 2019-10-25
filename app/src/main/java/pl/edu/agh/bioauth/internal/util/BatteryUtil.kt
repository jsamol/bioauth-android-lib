package pl.edu.agh.bioauth.internal.util

import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager
import pl.edu.agh.bioauth.BioAuth
import pl.edu.agh.bioauth.exception.SdkUninitializedException

internal class BatteryUtil {
    @get:Throws(SdkUninitializedException::class)
    private val applicationContext: Context
        get() = BioAuth.instance?.applicationContext ?: ErrorUtil.failWithSdkUninitialized()

    private val batteryStatusIntent: Intent? by lazy {
        IntentFilter(Intent.ACTION_BATTERY_CHANGED).let { applicationContext.registerReceiver(null, it) }
    }

    private val batteryManager: BatteryManager? by lazy {
        applicationContext.getSystemService(Context.BATTERY_SERVICE) as? BatteryManager
    }

    val batteryLevel: Float
        get() = batteryStatusIntent?.let {
            val level = it.getIntExtra(BatteryManager.EXTRA_LEVEL, -1)
            val scale = it.getIntExtra(BatteryManager.EXTRA_SCALE, -1)

            level.toFloat() / scale.toFloat()
        } ?: -1.0f

    val chargeCounter: Long
        get() = batteryManager?.getLongProperty(BatteryManager.BATTERY_PROPERTY_CHARGE_COUNTER) ?: -1

    val chargeType: Int
        get() = batteryStatusIntent?.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1) ?: -1
}