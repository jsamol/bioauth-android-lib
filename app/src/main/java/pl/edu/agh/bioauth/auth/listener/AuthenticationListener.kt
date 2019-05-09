package pl.edu.agh.bioauth.auth.listener

interface AuthenticationListener {
    fun onSuccess(userId: String, challenge: String, signedChallenge: String)
    fun onFailure(error: Throwable)
    fun onError(error: Throwable)
}