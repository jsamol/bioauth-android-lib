package pl.edu.agh.bioauth.internal.biometrics.facerecognition.listener

import android.media.ImageReader

class FaceOnImageAvailableListener : ImageReader.OnImageAvailableListener {

    lateinit var onImageAvailable: (ImageReader) -> Unit

    override fun onImageAvailable(reader: ImageReader?) {
        reader?.let(onImageAvailable)
    }
}