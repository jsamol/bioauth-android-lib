package pl.edu.agh.bioauth.internal.network.callback

import com.google.gson.Gson
import pl.edu.agh.bioauth.auth.listener.AuthenticationListener
import pl.edu.agh.bioauth.exception.AuthenticationException
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import pl.edu.agh.bioauth.internal.network.model.response.AuthenticateResponse

internal class AuthenticationCallback(
    biometricsType: BiometricsType,
    gson: Gson
) : ResultCallback<AuthenticateResponse, AuthenticationListener, AuthenticationException>(biometricsType, gson) {

    override val onSuccess: (AuthenticateResponse) -> Unit = { listener.onSuccess(it.userId, challenge, it.challenge) }

    lateinit var challenge: String

    override fun getException(message: String?, cause: Throwable?): AuthenticationException =
        AuthenticationException(message, cause)
}