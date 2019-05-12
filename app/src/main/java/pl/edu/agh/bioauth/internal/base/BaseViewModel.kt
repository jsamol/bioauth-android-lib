package pl.edu.agh.bioauth.internal.base

import androidx.lifecycle.ViewModel
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import pl.edu.agh.bioauth.internal.di.Injectable
import pl.edu.agh.bioauth.internal.util.FileUtil

internal abstract class BaseViewModel : ViewModel(), Injectable {

    abstract val biometricsType: BiometricsType

    var isInitialized: Boolean = false
        private set

    fun onInitialized() {
        initDependencies()
        isInitialized = true
    }

    override fun onCleared() {
        FileUtil.deleteTempFiles(biometricsType)
        cleanDependencies()
        super.onCleared()
    }
}