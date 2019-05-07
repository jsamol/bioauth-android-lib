package pl.edu.agh.bioauth

import android.content.Context
import pl.edu.agh.bioauth.internal.AppCredentials

class BioAuth(context: Context, appId: String, appSecret: String) {

    internal val applicationContext: Context = context.applicationContext
    internal val appCredentials: AppCredentials = AppCredentials(appId, appSecret)

    companion object {
        internal var instance: BioAuth? = null

        fun init(context: Context, appId: String, appSecret: String) {
            instance = BioAuth(context, appId, appSecret)
        }
    }
}