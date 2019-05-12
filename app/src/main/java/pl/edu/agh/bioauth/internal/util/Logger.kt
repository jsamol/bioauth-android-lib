package pl.edu.agh.bioauth.internal.util

import android.util.Log

internal object Logger {
    fun d(source: Any, message: String) {
        Log.d(source::class.java.name, message)
    }

    fun d(source: Any, throwable: Throwable) {
        Log.d(source::class.java.name, throwable.message, throwable)
    }

    fun e(source: Any, message: String) {
        Log.e(source::class.java.name, message)
    }

    fun e(source: Any, throwable: Throwable) {
        Log.e(source::class.java.name, throwable.message, throwable)
    }
}