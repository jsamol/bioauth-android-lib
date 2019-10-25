package pl.edu.agh.bioauth.internal.base.controller

import pl.edu.agh.bioauth.auth.listener.AuthenticationListener
import pl.edu.agh.bioauth.exception.AuthenticationException
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import pl.edu.agh.bioauth.internal.network.callback.AuthenticationCallback
import pl.edu.agh.bioauth.internal.network.callback.SymmetricKeyCallback
import java.io.File

internal class AuthenticationController(
    biometricsType: BiometricsType,
    resultCallback: AuthenticationCallback,
    symmetricKeyCallback: SymmetricKeyCallback,
    resultListener: AuthenticationListener,
    override val userId: String?
) : BiometricMethodController<AuthenticationCallback, AuthenticationListener, AuthenticationException>(
    biometricsType,
    resultCallback,
    symmetricKeyCallback,
    resultListener
) {

    override fun sendSamples(samples: List<File>, keyId: String) {
        val challenge = securityUtil.challenge
        apiController
            .authenticate(userId, samples, challenge, keyId, biometricsType)
            .enqueue(resultCallback.also { it.challenge = challenge })
    }

    override fun getException(message: String?, cause: Throwable?): AuthenticationException =
        AuthenticationException(message, cause)
}