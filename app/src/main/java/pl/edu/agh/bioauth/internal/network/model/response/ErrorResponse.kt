package pl.edu.agh.bioauth.internal.network.model.response

import java.util.*

internal data class ErrorResponse(val status: Int, val error: String, val message: String, val path: String, val timestamp: Date)