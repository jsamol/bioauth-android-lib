package pl.edu.agh.bioauth.internal.base

import androidx.lifecycle.ViewModel
import pl.edu.agh.bioauth.internal.base.controller.BiometricMethodController
import pl.edu.agh.bioauth.internal.biometrics.common.exception.LivenessException
import pl.edu.agh.bioauth.internal.biometrics.common.preprocess.SamplesProcessor
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import pl.edu.agh.bioauth.internal.biometrics.common.type.MethodType
import pl.edu.agh.bioauth.internal.di.Injectable
import pl.edu.agh.bioauth.internal.util.ErrorUtil
import pl.edu.agh.bioauth.internal.util.FileUtil
import java.io.File
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KClass

internal abstract class BaseViewModel<T: SamplesProcessor<*>>(processorType: KClass<T>) : ViewModel(), Injectable {

    abstract val biometricsType: BiometricsType

    var method: MethodType<*>? = null
        set(value) {
            field = value
            value?.run { samplesProcessor.livenessMode = livenessMode }
        }

    var isInitialized: Boolean = false
        private set

    private val samplesProcessor: T by inject(processorType) {
        biometricsType = this@BaseViewModel.biometricsType
    }

    private val methodController: BiometricMethodController<*, *, *>? by factory({ method })

    override fun onCleared() {
        FileUtil.deleteTempFiles(biometricsType)
        cleanDependencies()
        super.onCleared()
    }

    final override fun <R, T : Any> inject(kClass: KClass<T>?, init: T.() -> Unit): ReadOnlyProperty<R, T> {
        return super.inject(kClass, init)
    }

    final override fun <R, T : Any, S> factory(selector: () -> S?, init: T.() -> Unit): ReadOnlyProperty<R, T?> {
        return super.factory(selector, init)
    }

    fun onInitialized() {
        initDependencies()
        isInitialized = true
    }

    protected fun processSamples(samples: List<File>) {
        methodController?.let {
            try {
                val processedSamples = samplesProcessor.preprocess(samples)
                it.run(processedSamples)
            } catch (e: LivenessException) {
                it.onFailure(e.message)
            }
        } ?: ErrorUtil.failWithIllegalState()
    }
}