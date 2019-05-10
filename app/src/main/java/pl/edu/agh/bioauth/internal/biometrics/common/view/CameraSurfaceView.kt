package pl.edu.agh.bioauth.internal.biometrics.common.view

import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import android.graphics.Paint
import android.graphics.PixelFormat
import android.graphics.RectF
import android.util.AttributeSet
import android.util.Size
import android.view.SurfaceHolder
import android.view.SurfaceView
import androidx.core.content.res.ResourcesCompat
import pl.edu.agh.bioauth.BioAuth
import pl.edu.agh.bioauth.R

internal class CameraSurfaceView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : SurfaceView(context, attrs, defStyleAttr) {

    var size: Size? = null
        set(value) {
            field = value
            requestLayout()
        }

    var faceBox: RectF? = null

    private val surfaceHolderCallback: SurfaceHolderCallback = SurfaceHolderCallback()

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        size?.let {
            holder.addCallback(surfaceHolderCallback)
            setMeasuredDimension(it.width, it.height)
        }
    }

    private inner class SurfaceHolderCallback : SurfaceHolder.Callback {

        private val appResources: Resources? = BioAuth.instance?.applicationContext?.resources

        private val paint: Paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = appResources?.let {
                ResourcesCompat.getColor(it, R.color.bioauth_camera_view_overlay, null)
            } ?: Color.BLACK
            strokeWidth =
                BOX_STROKE_WIDTH
            style = Paint.Style.STROKE
        }

        override fun surfaceChanged(holder: SurfaceHolder?, format: Int, width: Int, height: Int) {
            holder?.lockCanvas()?.let {

                val x = it.width / 2.0f
                val y = it.height / 2.0f

                val xOffset = it.width / OFFSET_FACTOR
                val yOffset = it.height / OFFSET_FACTOR

                val box = RectF(x - xOffset, y - yOffset, x + xOffset, y + yOffset)

                it.drawRoundRect(box,
                    BOX_STROKE_RADIUS,
                    BOX_STROKE_RADIUS, paint)

                holder.unlockCanvasAndPost(it)
                faceBox = box
            }
        }

        override fun surfaceDestroyed(holder: SurfaceHolder?) {

        }

        override fun surfaceCreated(holder: SurfaceHolder?) {

        }
    }

    init {
        setZOrderOnTop(true)
        holder.setFormat(PixelFormat.TRANSPARENT)
    }

    companion object {

        private const val BOX_STROKE_WIDTH = 5.0f
        private const val BOX_STROKE_RADIUS = 15.0f
        private const val OFFSET_FACTOR = 4.0f

    }
}