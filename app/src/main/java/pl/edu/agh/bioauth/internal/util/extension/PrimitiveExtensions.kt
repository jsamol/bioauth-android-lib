package pl.edu.agh.bioauth.internal.util.extension

import pl.edu.agh.bioauth.internal.util.ErrorUtil
import kotlin.math.pow
import kotlin.math.round

internal fun Int.assertEqual(x: Int): Int? =
    if (this == x) this
    else null

internal fun Int.limitTo(max: Int): Int =
    if (this < max) this
    else max

internal fun Float.round(decimalPlaces: Int): Float {
    val factor = 10.0f.pow(decimalPlaces)

    return round(this * factor) / factor
}

internal fun Boolean.toInt(): Int = if (this) 1 else 0

internal operator fun Number.plus(other: Number): Number =
    when (this) {
        is Byte -> this.toByte() + other.toByte()
        is Short -> this.toShort() + other.toShort()
        is Int -> this.toInt() + other.toInt()
        is Long -> this.toLong() + other.toLong()
        is Float -> this.toFloat() + other.toFloat()
        is Double -> this.toDouble() + other.toDouble()
        else -> ErrorUtil.failWithUnknownNumericType()
    }

internal operator fun Number.compareTo(other: Number): Int =
    when (this) {
        is Byte -> this.toByte().compareTo(other.toByte())
        is Short -> this.toShort().compareTo(other.toShort())
        is Int -> this.toInt().compareTo(other.toInt())
        is Long -> this.toLong().compareTo(other.toLong())
        is Float -> this.toFloat().compareTo(other.toFloat())
        is Double -> this.toDouble().compareTo(other.toDouble())
        else -> ErrorUtil.failWithUnknownNumericType()
    }

internal fun <T: Number> min(a: T, b: T): T = if (a > b) b else a