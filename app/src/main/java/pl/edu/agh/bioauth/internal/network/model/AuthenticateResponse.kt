package pl.edu.agh.bioauth.internal.network.model

data class AuthenticateResponse(val userId: String, val challenge: String)