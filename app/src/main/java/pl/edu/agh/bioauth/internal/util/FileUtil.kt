package pl.edu.agh.bioauth.internal.util

import android.media.Image
import org.json.JSONObject
import pl.edu.agh.bioauth.BioAuth
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import pl.edu.agh.bioauth.internal.util.type.FileType.JSON
import java.io.File
import java.io.FileOutputStream
import java.io.IOException

internal object FileUtil {
    private const val META_DATA_FILE_PREFIX = "meta_data"

    private val appCacheDir: File? = BioAuth.instance?.applicationContext?.cacheDir

    fun createTempFile(biometricsType: BiometricsType): File =
        with (biometricsType) {
            createTempFile(methodName, fileType, tempDir)
        }

    fun createMetadataTempFile(biometricsType: BiometricsType, values: Map<String, Any?>): File =
        createTempFile(META_DATA_FILE_PREFIX, JSON, biometricsType.tempDir).apply {
            bufferedWriter().use {
                it.write(JSONObject(values).toString())
            }
        }

    fun deleteTempFiles(biometricsType: BiometricsType) {
        val tempDir = File(appCacheDir, biometricsType.tempDir)
        tempDir.deleteRecursively()
    }

    private fun createTempFile(prefix: String, fileType: String, dir: String): File {
        val tempDir = File(appCacheDir, dir)
        if (!tempDir.exists()) {
            tempDir.mkdir()
        }
        return File.createTempFile(prefix, fileType, tempDir)
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