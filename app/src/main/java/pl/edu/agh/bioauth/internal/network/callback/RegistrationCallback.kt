package pl.edu.agh.bioauth.internal.network.callback

import com.google.gson.Gson
import pl.edu.agh.bioauth.auth.listener.RegistrationListener
import pl.edu.agh.bioauth.exception.RegistrationException
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import pl.edu.agh.bioauth.internal.network.model.response.RegisterResponse
import pl.edu.agh.bioauth.internal.util.extension.toPublicKey

internal class RegistrationCallback(
    biometricsType: BiometricsType,
    gson: Gson
) : ResultCallback<RegisterResponse, RegistrationListener, RegistrationException>(biometricsType, gson) {

    override val onSuccess: (RegisterResponse) -> Unit = { listener.onSuccess(it.publicKey.toPublicKey()) }

    override fun getException(message: String?, cause: Throwable?): RegistrationException =
        RegistrationException(message, cause)
}
