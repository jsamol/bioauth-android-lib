package pl.edu.agh.bioauth.auth.listener

interface AuthenticationListener : ResultListener {
    fun onSuccess(userId: String, challenge: String, signedChallenge: String)
}