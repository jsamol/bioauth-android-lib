package pl.edu.agh.bioauth.internal.di.module.common


import android.util.Log.INFO
import okhttp3.OkHttpClient
import okhttp3.internal.platform.Platform
import okhttp3.logging.HttpLoggingInterceptor
import pl.edu.agh.bioauth.BuildConfig
import pl.edu.agh.bioauth.internal.di.module.AbstractModule
import pl.edu.agh.bioauth.internal.network.ApiController
import pl.edu.agh.bioauth.internal.network.callback.VoidCallback
import pl.edu.agh.bioauth.internal.network.service.AuthenticationService
import pl.edu.agh.bioauth.internal.network.service.EncryptionService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

internal class NetworkModule : AbstractModule() {

    private val httpSecondsTimeout: Long = 60

    private val httpLoggingInterceptor: HttpLoggingInterceptor
        get() = HttpLoggingInterceptor(HttpLoggingInterceptor.Logger { message ->
            val httpMessage = if (message.contains("�")) {
                val ignoredRegex = Regex("([�\b])")
                val lines = message.lines().filterNot { it.isBlank() || it.contains(ignoredRegex) || !it.contains(":")}
                if (lines.isNotEmpty()) lines.joinToString(separator = "\n") else ""
            } else message

            if (message.isNotBlank()) {
                Platform.get().log(INFO, httpMessage, null)
            }
        }).apply { level = HttpLoggingInterceptor.Level.BODY}

    private val okHttpClient: OkHttpClient
        get() = OkHttpClient.Builder().apply {
            if (BuildConfig.DEBUG) {
                addInterceptor(httpLoggingInterceptor)
            }
            writeTimeout(httpSecondsTimeout, TimeUnit.SECONDS)
            readTimeout(httpSecondsTimeout, TimeUnit.SECONDS)
            connectTimeout(httpSecondsTimeout, TimeUnit.SECONDS)
        }.build()

    private val retrofit: Retrofit
        get() = Retrofit.Builder()
            .baseUrl(BuildConfig.API_BASE)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    private val authenticationService: AuthenticationService
        get() = retrofit.create(AuthenticationService::class.java)

    private val encryptionService: EncryptionService
        get() = retrofit.create(EncryptionService::class.java)

    val apiController: ApiController
        get() = ApiController(authenticationService, encryptionService)

    val voidCallback: VoidCallback
        get() = VoidCallback()
}