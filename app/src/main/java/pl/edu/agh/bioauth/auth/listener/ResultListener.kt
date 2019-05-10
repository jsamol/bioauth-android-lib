package pl.edu.agh.bioauth.auth.listener

interface ResultListener {
    fun onFailure(error: Throwable)
}