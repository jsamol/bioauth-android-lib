package pl.edu.agh.bioauth.internal.base

import androidx.lifecycle.ViewModel
import pl.edu.agh.bioauth.exception.AuthenticationException
import pl.edu.agh.bioauth.exception.RegistrationException
import pl.edu.agh.bioauth.internal.biometrics.common.exception.LivenessException
import pl.edu.agh.bioauth.internal.biometrics.common.preprocess.SamplesProcessor
import pl.edu.agh.bioauth.internal.biometrics.common.type.AuthenticationMethod
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import pl.edu.agh.bioauth.internal.biometrics.common.type.MethodType
import pl.edu.agh.bioauth.internal.biometrics.common.type.RegistrationMethod
import pl.edu.agh.bioauth.internal.di.Injectable
import pl.edu.agh.bioauth.internal.network.ApiController
import pl.edu.agh.bioauth.internal.network.callback.AuthenticationCallback
import pl.edu.agh.bioauth.internal.network.callback.RegistrationCallback
import pl.edu.agh.bioauth.internal.util.ErrorUtil
import pl.edu.agh.bioauth.internal.util.FileUtil
import pl.edu.agh.bioauth.internal.util.SecurityUtil
import java.io.File
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KClass
import kotlin.reflect.KType
import kotlin.reflect.full.createType

internal abstract class BaseViewModel<T: SamplesProcessor<*>>(processorType: KClass<T>) : ViewModel(), Injectable {

    abstract val biometricsType: BiometricsType

    var method: MethodType<*>? = null
        set(value) {
            field = value
            value?.let {
                samplesProcessor.livenessMode = it.livenessMode
                when (it) {
                    is RegistrationMethod -> registrationCallback.listener = it.listener
                    is AuthenticationMethod -> authenticationCallback.listener = it.listener
                }
            }
        }

    var isInitialized: Boolean = false
        private set

    private val apiController: ApiController by inject()
    private val securityUtil: SecurityUtil by inject()

    private val samplesProcessor: T by inject(processorType.createType()) {
        biometricsType = this@BaseViewModel.biometricsType
    }

    private val registrationCallback: RegistrationCallback by inject()
    private val authenticationCallback: AuthenticationCallback by inject()

    override fun onCleared() {
        FileUtil.deleteTempFiles(biometricsType)
        cleanDependencies()
        super.onCleared()
    }

    final override fun <R, T> inject(kType: KType?, init: (T.() -> Unit)?): ReadOnlyProperty<R, T> {
        return super.inject(kType, init)
    }

    protected fun processSamples(samples: List<File>) {
        method?.let {
            try {
                val processedPhotos = samplesProcessor.preprocess(samples)
                when (it) {
                    is RegistrationMethod -> registerSamples(it.userId, processedPhotos)
                    is AuthenticationMethod -> authenticate(it.userId, processedPhotos)
                }
            } catch (e: LivenessException) {
                val exception = when (it) {
                    is RegistrationMethod -> RegistrationException(e.message)
                    is AuthenticationMethod -> AuthenticationException(e.message)
                }
                it.listener.onFailure(exception)
            }
        } ?: ErrorUtil.failWithIllegalState()
    }

    private fun registerSamples(userId: String, samples: List<File>) {
        apiController
            .registerSamples(userId, samples, biometricsType)
            .enqueue(registrationCallback)
    }

    private fun authenticate(userId: String?, samples: List<File>) {
        val challenge = securityUtil.challenge
        apiController
            .authenticate(userId, samples, challenge, biometricsType)
            .enqueue(authenticationCallback.also { it.challenge = challenge })
    }

    fun onInitialized() {
        initDependencies()
        isInitialized = true
    }
}