package pl.edu.agh.bioauth.internal.biometrics.common.type

import okhttp3.MediaType
import pl.edu.agh.bioauth.internal.util.type.FileType
import pl.edu.agh.bioauth.internal.util.type.MimeType

internal enum class BiometricsType(
    val methodName: String,
    val tempDir: String,
    val fileType: String,
    mimeType: String
) {
    FACE("face","facerecognition", FileType.JPEG, MimeType.IMAGE);

    val mediaType: MediaType? = MediaType.parse(mimeType)
}