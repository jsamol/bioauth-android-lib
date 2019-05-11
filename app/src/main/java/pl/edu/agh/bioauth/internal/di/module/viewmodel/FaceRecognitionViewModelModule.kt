package pl.edu.agh.bioauth.internal.di.module.viewmodel

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import pl.edu.agh.bioauth.internal.di.module.AbstractModule
import pl.edu.agh.bioauth.internal.network.callback.AuthenticationCallback
import pl.edu.agh.bioauth.internal.network.callback.RegistrationCallback

internal class FaceRecognitionViewModelModule : AbstractModule() {

    private val gson: Gson
        get() = GsonBuilder()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
            .create()

    val biometricsType: BiometricsType = BiometricsType.FACE

    val registrationCallback: RegistrationCallback
        get() = RegistrationCallback(biometricsType, gson)

    val authenticationCallback: AuthenticationCallback
        get() = AuthenticationCallback(biometricsType, gson)
}