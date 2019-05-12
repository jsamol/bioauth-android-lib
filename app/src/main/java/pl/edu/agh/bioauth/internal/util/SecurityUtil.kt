package pl.edu.agh.bioauth.internal.util

import java.util.*

internal class SecurityUtil {

    val challenge: String
        get() = UUID.randomUUID().toString()
}