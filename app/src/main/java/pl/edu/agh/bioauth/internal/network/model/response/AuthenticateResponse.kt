package pl.edu.agh.bioauth.internal.network.model.response

data class AuthenticateResponse(val userId: String, val challenge: String)