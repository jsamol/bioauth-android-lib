package pl.edu.agh.bioauth.internal.di.factory.common

import pl.edu.agh.bioauth.internal.base.controller.AuthenticationController
import pl.edu.agh.bioauth.internal.base.controller.BiometricMethodController
import pl.edu.agh.bioauth.internal.base.controller.RegistrationController
import pl.edu.agh.bioauth.internal.biometrics.common.type.AuthenticationMethod
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import pl.edu.agh.bioauth.internal.biometrics.common.type.MethodType
import pl.edu.agh.bioauth.internal.biometrics.common.type.RegistrationMethod
import pl.edu.agh.bioauth.internal.di.annotation.FactoryReturn
import pl.edu.agh.bioauth.internal.di.factory.AbstractFactory
import pl.edu.agh.bioauth.internal.network.callback.AuthenticationCallback
import pl.edu.agh.bioauth.internal.network.callback.RegistrationCallback

@FactoryReturn(BiometricMethodController::class)
internal class BiometricMethodControllerFactory(
    private val biometricsType: BiometricsType,
    private val registrationCallback: RegistrationCallback,
    private val authenticationCallback: AuthenticationCallback
) : AbstractFactory<MethodType<*>, BiometricMethodController<*, *, *>>() {

    override fun create(selector: MethodType<*>): BiometricMethodController<*, *, *> =
        with(selector) {
            when (this) {
                is RegistrationMethod -> RegistrationController(
                    biometricsType,
                    registrationCallback.also { it.listener = listener },
                    listener,
                    userId
                )
                is AuthenticationMethod -> AuthenticationController(
                    biometricsType,
                    authenticationCallback.also { it.listener = listener },
                    listener,
                    userId
                )
            }
        }
}