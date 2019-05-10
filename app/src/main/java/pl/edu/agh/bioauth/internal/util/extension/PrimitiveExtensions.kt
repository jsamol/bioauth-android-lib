package pl.edu.agh.bioauth.internal.util.extension

internal fun Int.assertEqual(x: Int): Int? =
    if (this == x) this
    else null

internal fun Int.limitTo(max: Int): Int =
    if (this < max) this
    else max