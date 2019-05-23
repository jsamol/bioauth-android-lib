package pl.edu.agh.bioauth.internal.base.controller

import pl.edu.agh.bioauth.auth.listener.AuthenticationListener
import pl.edu.agh.bioauth.exception.AuthenticationException
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import pl.edu.agh.bioauth.internal.network.callback.AuthenticationCallback
import java.io.File

internal class AuthenticationController(
    biometricsType: BiometricsType,
    resultCallback: AuthenticationCallback,
    resultListener: AuthenticationListener,
    override val userId: String?
) : BiometricMethodController<AuthenticationCallback, AuthenticationListener, AuthenticationException>(
    biometricsType,
    resultCallback,
    resultListener
) {

    override fun run(samples: List<File>) {
        val challenge = securityUtil.challenge
        apiController
            .authenticate(userId, samples, challenge, biometricsType)
            .enqueue(resultCallback.also { it.challenge = challenge })
    }

    override fun getException(message: String?, cause: Throwable?): AuthenticationException =
        AuthenticationException(message, cause)
}