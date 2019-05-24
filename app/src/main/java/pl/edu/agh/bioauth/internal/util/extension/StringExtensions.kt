package pl.edu.agh.bioauth.internal.util.extension

import android.util.Base64

internal fun String.decode64(): ByteArray = Base64.decode(this, Base64.NO_WRAP)

internal fun ByteArray.encode64(): String = Base64.encodeToString(this, Base64.NO_WRAP)