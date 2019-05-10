package pl.edu.agh.bioauth.internal.biometrics.facerecognition.listener

import android.graphics.SurfaceTexture
import android.view.TextureView

class FaceSurfaceTextureListener : TextureView.SurfaceTextureListener {

    private lateinit var _onSurfaceTextureAvailable: (Int, Int) -> Unit
    private lateinit var _onSurfaceTextureSizeChanged: (Int, Int) -> Unit

    override fun onSurfaceTextureAvailable(surface: SurfaceTexture?, width: Int, height: Int) =
        _onSurfaceTextureAvailable(width, height)

    override fun onSurfaceTextureSizeChanged(surface: SurfaceTexture?, width: Int, height: Int) =
        _onSurfaceTextureSizeChanged(width, height)

    override fun onSurfaceTextureDestroyed(surface: SurfaceTexture?): Boolean = true

    override fun onSurfaceTextureUpdated(surface: SurfaceTexture?) {

    }

    fun initListeners(onSurfaceTextureAvailable: (Int, Int) -> Unit, onSurfaceTextureSizeChanged: (Int, Int) -> Unit) {
        _onSurfaceTextureAvailable = onSurfaceTextureAvailable
        _onSurfaceTextureSizeChanged = onSurfaceTextureSizeChanged
    }
}