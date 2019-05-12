package pl.edu.agh.bioauth.internal.network.callback

import com.google.gson.Gson
import pl.edu.agh.bioauth.auth.listener.AuthenticationListener
import pl.edu.agh.bioauth.exception.AuthenticationException
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import pl.edu.agh.bioauth.internal.network.model.response.AuthenticateResponse
import retrofit2.Call
import retrofit2.Response

internal class AuthenticationCallback(
    biometricsType: BiometricsType,
    gson: Gson
) : ResponseCallback<AuthenticateResponse>(biometricsType, gson) {

    lateinit var listener: AuthenticationListener
    lateinit var challenge: String

    override fun onFailure(call: Call<AuthenticateResponse>, t: Throwable) {
        listener.onFailure(AuthenticationException(cause = t))
        doFinally()
    }

    override fun onResponse(call: Call<AuthenticateResponse>, response: Response<AuthenticateResponse>) {
        with (response) {
            if (isSuccessful) {
                body()?.let {
                    listener.onSuccess(it.userId, challenge, it.challenge)
                } ?: listener.onFailure(AuthenticationException())
            } else {
                listener.onFailure(AuthenticationException(getErrorMessage(this)))
            }
        }
        doFinally()
    }
}