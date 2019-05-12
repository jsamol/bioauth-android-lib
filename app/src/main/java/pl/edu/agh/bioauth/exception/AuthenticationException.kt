package pl.edu.agh.bioauth.exception

import java.lang.Exception

class AuthenticationException(message: String? = null, cause: Throwable? = null) : Exception(message, cause)