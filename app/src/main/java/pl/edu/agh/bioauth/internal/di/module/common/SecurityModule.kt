package pl.edu.agh.bioauth.internal.di.module.common

import pl.edu.agh.bioauth.internal.di.module.AbstractModule
import pl.edu.agh.bioauth.internal.util.SecurityUtil

internal class SecurityModule : AbstractModule() {

    val securityUtil: SecurityUtil
        get() = SecurityUtil()
}