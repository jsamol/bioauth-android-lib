package pl.edu.agh.bioauth.auth.listener

import java.security.PublicKey

interface RegistrationListener {
    fun onSuccess(publicKey: PublicKey)
    fun onFailure(error: Throwable)
    fun onError(error: Throwable)
}