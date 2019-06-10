package pl.edu.agh.bioauth.internal.util

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import pl.edu.agh.bioauth.BioAuth
import pl.edu.agh.bioauth.exception.SdkUninitializedException

internal class ConnectionUtil {
    @get:Throws(SdkUninitializedException::class)
    private val applicationContext: Context
        get() = BioAuth.instance?.applicationContext ?: ErrorUtil.failWithSdkUninitialized()

    private val connectivityManager: ConnectivityManager? by lazy {
        applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as? ConnectivityManager
    }

    val connectionType: Int
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
}