package pl.edu.agh.bioauth.internal.util

import android.media.Image
import pl.edu.agh.bioauth.BioAuth
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import java.io.File
import java.io.FileOutputStream
import java.io.IOException

internal object FileUtil {
    private val appCacheDir: File? = BioAuth.instance?.applicationContext?.cacheDir

    fun createTempFile(biometricsType: BiometricsType): File {
        val tempDir = File(appCacheDir, biometricsType.tempDir)
        if (!tempDir.exists()) {
            tempDir.mkdir()
        }
        return File.createTempFile(biometricsType.methodName, biometricsType.fileType, tempDir)
    }

    fun deleteTempFiles(biometricsType: BiometricsType) {
        val tempDir = File(appCacheDir, biometricsType.tempDir)
        tempDir.deleteRecursively()
    }

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