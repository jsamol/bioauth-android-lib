package pl.edu.agh.bioauth.internal.util.extension

import android.util.Size
import kotlin.math.sign

internal fun Size.toComparable(): Comparable<Size> = object : Comparable<Size> {
    override fun compareTo(other: Size): Int = (getArea() - other.getArea()).sign
}

internal fun Size.getArea(): Long = width.toLong() * height.toLong()