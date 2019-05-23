package pl.edu.agh.bioauth.internal.base.controller

import pl.edu.agh.bioauth.auth.listener.RegistrationListener
import pl.edu.agh.bioauth.exception.RegistrationException
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import pl.edu.agh.bioauth.internal.network.callback.RegistrationCallback
import java.io.File

internal class RegistrationController(
    biometricsType: BiometricsType,
    resultCallback: RegistrationCallback,
    resultListener: RegistrationListener,
    override val userId: String
) : BiometricMethodController<RegistrationCallback, RegistrationListener, RegistrationException>(
    biometricsType,
    resultCallback,
    resultListener
) {

    override fun run(samples: List<File>) {
        apiController
            .registerSamples(userId, samples, biometricsType)
            .enqueue(resultCallback)
    }

    override fun getException(message: String?, cause: Throwable?): RegistrationException =
        RegistrationException(message, cause)
}