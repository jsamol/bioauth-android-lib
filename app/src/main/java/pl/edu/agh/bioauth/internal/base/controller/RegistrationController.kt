package pl.edu.agh.bioauth.internal.base.controller

import pl.edu.agh.bioauth.auth.listener.RegistrationListener
import pl.edu.agh.bioauth.exception.RegistrationException
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import pl.edu.agh.bioauth.internal.network.callback.RegistrationCallback
import pl.edu.agh.bioauth.internal.network.callback.SymmetricKeyCallback
import java.io.File

internal class RegistrationController(
    biometricsType: BiometricsType,
    resultCallback: RegistrationCallback,
    symmetricKeyCallback: SymmetricKeyCallback,
    resultListener: RegistrationListener,
    override val userId: String
) : BiometricMethodController<RegistrationCallback, RegistrationListener, RegistrationException>(
    biometricsType,
    resultCallback,
    symmetricKeyCallback,
    resultListener
) {

    override fun sendSamples(samples: List<File>, keyId: String) {
        apiController
            .registerSamples(userId, samples, keyId, biometricsType)
            .enqueue(resultCallback)
    }

    override fun getException(message: String?, cause: Throwable?): RegistrationException =
        RegistrationException(message, cause)
}