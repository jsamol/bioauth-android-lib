package pl.edu.agh.bioauth.internal.util.extension

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