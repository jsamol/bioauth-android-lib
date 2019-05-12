package pl.edu.agh.bioauth.internal.network.callback

import com.google.gson.Gson
import pl.edu.agh.bioauth.auth.listener.RegistrationListener
import pl.edu.agh.bioauth.exception.RegistrationException
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import pl.edu.agh.bioauth.internal.network.model.response.RegisterResponse
import pl.edu.agh.bioauth.internal.util.extension.toPublicKey
import retrofit2.Call
import retrofit2.Response

internal class RegistrationCallback(
    biometricsType: BiometricsType,
    gson: Gson
) : ResponseCallback<RegisterResponse>(biometricsType, gson) {

    lateinit var listener: RegistrationListener

    override fun onFailure(call: Call<RegisterResponse>, t: Throwable) {
        listener.onFailure(RegistrationException(cause = t))
        doFinally()
    }

    override fun onResponse(call: Call<RegisterResponse>, response: Response<RegisterResponse>) {
        with (response) {
            if (isSuccessful) {
                body()?.publicKey?.let {
                    listener.onSuccess(it.toPublicKey())
                } ?: listener.onFailure(RegistrationException())
            } else {
                listener.onFailure(RegistrationException(getErrorMessage(this)))
            }
        }
        doFinally()
    }
}