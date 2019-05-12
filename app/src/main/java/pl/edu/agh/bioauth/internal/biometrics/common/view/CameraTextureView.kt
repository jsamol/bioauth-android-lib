package pl.edu.agh.bioauth.internal.biometrics.common.view

import android.content.Context
import android.util.AttributeSet
import android.util.Size
import android.view.TextureView
import pl.edu.agh.bioauth.internal.util.ErrorUtil
import java.lang.IllegalStateException

internal class CameraTextureView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : TextureView(context, attrs, defStyleAttr) {

    @set:Throws(IllegalStateException::class)
    var ratioSize: Size = Size(
        DEFAULT_WIDTH,
        DEFAULT_HEIGHT
    )
        set(value) {
            if (value.width < 0 || value.height < 0) {
                ErrorUtil.failWithIllegalState()
            }

            field = value
            requestLayout()
        }

    var onDimensionsMeasured: ((Int, Int) -> Unit)? = null

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        val width = MeasureSpec.getSize(widthMeasureSpec)
        val height = MeasureSpec.getSize(heightMeasureSpec)

        var measuredWidth = width
        var measuredHeight = height

        when {
            ratioSize.width == 0 || ratioSize.height == 0 -> setMeasuredDimension(measuredWidth, measuredHeight)
            width < height * ratioSize.width / ratioSize.height -> {
                measuredHeight = width * ratioSize.height / ratioSize.width
                setMeasuredDimension(measuredWidth, measuredHeight)
            }
            else -> {
                measuredWidth = height * ratioSize.width / ratioSize.height
                setMeasuredDimension(measuredWidth, measuredHeight)
            }
        }

        onDimensionsMeasured?.let { it(measuredWidth, measuredHeight) }
    }

    companion object {
        private const val DEFAULT_WIDTH = 0
        private const val DEFAULT_HEIGHT = 0
    }
}