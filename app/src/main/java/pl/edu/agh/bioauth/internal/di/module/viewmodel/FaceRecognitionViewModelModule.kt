package pl.edu.agh.bioauth.internal.di.module.viewmodel

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import pl.edu.agh.bioauth.internal.di.annotation.Factory
import pl.edu.agh.bioauth.internal.di.factory.common.BiometricMethodControllerFactory
import pl.edu.agh.bioauth.internal.di.module.AbstractModule
import pl.edu.agh.bioauth.internal.network.callback.AuthenticationCallback
import pl.edu.agh.bioauth.internal.network.callback.RegistrationCallback

internal class FaceRecognitionViewModelModule : AbstractModule() {

    private val gson: Gson
        get() = GsonBuilder()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
            .create()

    private val registrationCallback: RegistrationCallback
        get() = RegistrationCallback(biometricsType, gson)

    private val authenticationCallback: AuthenticationCallback
        get() = AuthenticationCallback(biometricsType, gson)

    val biometricsType: BiometricsType = BiometricsType.FACE

    @Factory
    val methodControllerFactory: BiometricMethodControllerFactory
        get() = BiometricMethodControllerFactory(biometricsType, registrationCallback, authenticationCallback)
}