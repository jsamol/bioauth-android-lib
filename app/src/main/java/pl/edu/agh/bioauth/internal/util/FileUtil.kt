package pl.edu.agh.bioauth.internal.util

import android.media.Image
import org.json.JSONObject
import pl.edu.agh.bioauth.BioAuth
import pl.edu.agh.bioauth.exception.SdkUninitializedException
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import pl.edu.agh.bioauth.internal.util.type.FileType.JSON
import java.io.File
import java.io.FileOutputStream
import java.io.IOException

internal object FileUtil {
    private const val DEFAULT_FILE_PREFIX = "file"
    private const val META_DATA_FILE_PREFIX = "meta_data"

    @get:Throws(SdkUninitializedException::class)
    private val appCacheDir: File
        get() = BioAuth.instance?.applicationContext?.cacheDir ?: ErrorUtil.failWithSdkUninitialized()

    @Throws(SdkUninitializedException::class)
    fun createTempFile(fileType: String): File =
        createTempFile(null, fileType, "")

    @Throws(SdkUninitializedException::class)
    fun createTempFile(biometricsType: BiometricsType): File =
        with (biometricsType) {
            createTempFile(methodName, fileType, tempDir)
        }

    @Throws(SdkUninitializedException::class)
    fun createMetadataTempFile(biometricsType: BiometricsType, values: Map<String, Any?>): File =
        createTempFile(META_DATA_FILE_PREFIX, JSON, biometricsType.tempDir).apply {
            bufferedWriter().use {
                it.write(JSONObject(values).toString())
            }
        }

    @Throws(SdkUninitializedException::class)
    fun deleteTempFiles(biometricsType: BiometricsType) {
        val tempDir = File(appCacheDir, biometricsType.tempDir)
        tempDir.deleteRecursively()
    }


    @Throws(SdkUninitializedException::class)
    private fun createTempFile(prefix: String?, fileType: String, dir: String): File {
        val tempDir = File(appCacheDir, dir)
        if (!tempDir.exists()) {
            tempDir.mkdir()
        }
        return File.createTempFile(prefix ?: DEFAULT_FILE_PREFIX, fileType, tempDir)
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