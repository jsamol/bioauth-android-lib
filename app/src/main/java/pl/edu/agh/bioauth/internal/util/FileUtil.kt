package pl.edu.agh.bioauth.internal.util

import android.media.Image
import pl.edu.agh.bioauth.BioAuth
import java.io.File
import java.io.FileOutputStream
import java.io.IOException

internal object FileUtil {
    private const val DEFAULT_PREFIX = "file"
    private const val DEFAULT_SUFFIX = ".jpeg"

    private val appCacheDir: File? = BioAuth.instance?.applicationContext?.cacheDir

    fun createTempFile(prefix: String = DEFAULT_PREFIX, suffix: String = DEFAULT_SUFFIX): File =
        File.createTempFile(prefix, suffix, appCacheDir)

    class ImageSaver(private val image: Image, private val imageFile: File?) : Runnable {
        override fun run() {
            image.planes[0].buffer.let { buffer ->
                val bytes = ByteArray(buffer.remaining()).also { buffer.get(it) }
                try {
                    FileOutputStream(imageFile).use {
                        it.write(bytes)
                    }
                } catch (e: IOException) {
                    Logger.e(this, e)
                } finally {
                    image.close()
                }
            }
        }

    }
}