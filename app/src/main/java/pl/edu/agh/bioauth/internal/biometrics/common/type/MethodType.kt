package pl.edu.agh.bioauth.internal.biometrics.common.type

import pl.edu.agh.bioauth.auth.listener.AuthenticationListener
import pl.edu.agh.bioauth.auth.listener.RegistrationListener
import pl.edu.agh.bioauth.auth.listener.ResultListener

internal sealed class MethodType<L: ResultListener> {
    abstract val listener: L
}

internal data class RegistrationMethod(val userId: String, override val listener: RegistrationListener) : MethodType<RegistrationListener>()
internal data class AuthenticationMethod(val userId: String?, override val listener: AuthenticationListener) : MethodType<AuthenticationListener>()