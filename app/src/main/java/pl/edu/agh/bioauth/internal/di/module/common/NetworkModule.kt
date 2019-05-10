package pl.edu.agh.bioauth.internal.di.module.common


import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import pl.edu.agh.bioauth.BuildConfig
import pl.edu.agh.bioauth.internal.di.module.AbstractModule
import pl.edu.agh.bioauth.internal.network.ApiController
import pl.edu.agh.bioauth.internal.network.service.EncryptionService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

internal class NetworkModule : AbstractModule() {

    private val okHttpClient: OkHttpClient
        get() = OkHttpClient.Builder().apply {
            if (BuildConfig.DEBUG) {
                addInterceptor(HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY })
            }
        }.build()

    private val retrofit: Retrofit
        get() = Retrofit.Builder()
            .baseUrl(BuildConfig.API_BASE)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    private val encryptionService: EncryptionService
        get() = retrofit.create(EncryptionService::class.java)


    val apiController: ApiController
        get() = ApiController(encryptionService)
}