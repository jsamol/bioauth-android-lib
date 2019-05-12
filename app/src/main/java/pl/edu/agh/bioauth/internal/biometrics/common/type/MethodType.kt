package pl.edu.agh.bioauth.internal.biometrics.common.type

import pl.edu.agh.bioauth.auth.LivenessMode
import pl.edu.agh.bioauth.auth.listener.AuthenticationListener
import pl.edu.agh.bioauth.auth.listener.RegistrationListener
import pl.edu.agh.bioauth.auth.listener.ResultListener

internal sealed class MethodType<L: ResultListener> {
    abstract val listener: L
    abstract val livenessMode: LivenessMode
}

internal data class RegistrationMethod(
    val userId: String,
    override val listener: RegistrationListener,
    override val livenessMode: LivenessMode
) : MethodType<RegistrationListener>()

internal data class AuthenticationMethod(
    val userId: String?,
    override val listener: AuthenticationListener,
    override val livenessMode: LivenessMode
) : MethodType<AuthenticationListener>()