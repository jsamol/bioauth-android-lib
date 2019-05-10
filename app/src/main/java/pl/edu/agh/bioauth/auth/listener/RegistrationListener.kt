package pl.edu.agh.bioauth.auth.listener

import java.security.PublicKey

interface RegistrationListener : ResultListener {
    fun onSuccess(publicKey: PublicKey)
}