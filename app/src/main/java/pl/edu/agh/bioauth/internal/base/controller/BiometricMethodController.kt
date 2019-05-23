package pl.edu.agh.bioauth.internal.base.controller

import pl.edu.agh.bioauth.auth.listener.ResultListener
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import pl.edu.agh.bioauth.internal.di.Injectable
import pl.edu.agh.bioauth.internal.network.ApiController
import pl.edu.agh.bioauth.internal.network.callback.ResultCallback
import pl.edu.agh.bioauth.internal.util.SecurityUtil
import java.io.File
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KClass

internal abstract class BiometricMethodController<C: ResultCallback<*, L, E>, L: ResultListener, E: Exception>(
    protected val biometricsType: BiometricsType,
    protected val resultCallback: C,
    private val resultListener: L
) : Injectable {

    protected abstract val userId: String?

    protected val apiController: ApiController by inject()
    protected val securityUtil: SecurityUtil by inject()

    abstract fun run(samples: List<File>)
    protected abstract fun getException(message: String?, cause: Throwable?): E

    final override fun <R, T : Any> inject(kClass: KClass<T>?, init: T.() -> Unit): ReadOnlyProperty<R, T> {
        return super.inject(kClass, init)
    }

    fun onFailure(message: String? = null, cause: Throwable? = null) = resultListener.onFailure(getException(message, cause))
}