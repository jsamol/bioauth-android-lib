package pl.edu.agh.bioauth.internal.base

import androidx.lifecycle.ViewModel

internal abstract class BaseViewModel : ViewModel() {

    var isInitialized: Boolean = false
        private set

    fun onInitialized() {
        isInitialized = true
    }
}