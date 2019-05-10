package pl.edu.agh.bioauth.internal.base

import androidx.lifecycle.ViewModel
import pl.edu.agh.bioauth.internal.di.Injectable

internal abstract class BaseViewModel : ViewModel(), Injectable {

    var isInitialized: Boolean = false
        private set

    fun onInitialized() {
        initDependencies()
        isInitialized = true
    }

    override fun onCleared() {
        cleanDependencies()
        super.onCleared()
    }
}