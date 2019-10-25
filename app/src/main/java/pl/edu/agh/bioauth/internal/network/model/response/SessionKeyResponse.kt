package pl.edu.agh.bioauth.internal.network.model.response

internal data class SessionKeyResponse(val id: String, val key: String, val iv: String)