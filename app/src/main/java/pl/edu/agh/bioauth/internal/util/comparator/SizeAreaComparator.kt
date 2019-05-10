package pl.edu.agh.bioauth.internal.util.comparator

import android.util.Size
import kotlin.math.sign

internal object SizeAreaComparator : Comparator<Size> {
    override fun compare(x: Size?, y: Size?): Int = (getArea(x) - getArea(y)).sign

    private fun getArea(size: Size?): Long = size?.run { width.toLong() * height.toLong() } ?: 0
}