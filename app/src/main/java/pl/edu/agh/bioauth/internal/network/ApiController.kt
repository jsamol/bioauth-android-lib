package pl.edu.agh.bioauth.internal.network

import okhttp3.MultipartBody
import okhttp3.RequestBody
import pl.edu.agh.bioauth.BioAuth
import pl.edu.agh.bioauth.exception.SdkUninitializedException
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import pl.edu.agh.bioauth.internal.data.AppCredentials
import pl.edu.agh.bioauth.internal.network.model.response.AuthenticateResponse
import pl.edu.agh.bioauth.internal.network.model.response.RegisterResponse
import pl.edu.agh.bioauth.internal.network.model.response.SessionKeyResponse
import pl.edu.agh.bioauth.internal.network.service.AuthenticationService
import pl.edu.agh.bioauth.internal.network.service.EncryptionService
import pl.edu.agh.bioauth.internal.util.ErrorUtil
import retrofit2.Call
import java.io.File

internal class ApiController(
    private val authenticationService: AuthenticationService,
    private val encryptionService: EncryptionService
) {

    @get:Throws(SdkUninitializedException::class)
    private val appCredentials: AppCredentials
        get() = BioAuth.instance?.appCredentials ?: ErrorUtil.failWithSdkUninitialized()

    fun registerSamples(userId: String, samples: List<File>, keyId: String, biometricsType: BiometricsType): Call<RegisterResponse> {
        with (appCredentials) {
            val samplesParam = createMultipartBodyParts(samples, MULTIPART_PARAM_SAMPLES, biometricsType)
            val appIdParam = createMultipartBodyPart(appId, MULTIPART_PARAM_APP_ID)
            val appSecretParam = createMultipartBodyPart(appSecret, MULTIPART_PARAM_APP_SECRET)
            val userIdParam = createMultipartBodyPart(userId, MULTIPART_PARAM_USER_ID)
            val keyIdParam = createMultipartBodyPart(keyId, MULTIPART_PARAM_KEY_ID)

            return authenticationService.register(
                biometricsType.methodName,
                samplesParam,
                appIdParam,
                appSecretParam,
                userIdParam,
                keyIdParam
            )
        }
    }

    fun authenticate(
        userId: String?,
        samples: List<File>,
        challenge: String,
        keyId: String,
        biometricsType: BiometricsType
    ): Call<AuthenticateResponse> {
        with (appCredentials) {
            val samplesParam = createMultipartBodyParts(samples, MULTIPART_PARAM_SAMPLES, biometricsType)
            val appIdParam = createMultipartBodyPart(appId, MULTIPART_PARAM_APP_ID)
            val appSecretParam = createMultipartBodyPart(appSecret, MULTIPART_PARAM_APP_SECRET)
            val challengeParam = createMultipartBodyPart(challenge, MULTIPART_PARAM_CHALLENGE)
            val userIdParam = userId?.let { createMultipartBodyPart(it, MULTIPART_PARAM_USER_ID) }
            val keyIdParam = createMultipartBodyPart(keyId, MULTIPART_PARAM_KEY_ID)

            return authenticationService.authenticate(
                biometricsType.methodName,
                samplesParam,
                appIdParam,
                appSecretParam,
                challengeParam,
                userIdParam,
                keyIdParam
            )
        }
    }

    fun getSessionKey(publicKey: String): Call<SessionKeyResponse> {
        with(appCredentials) {
            return encryptionService.getSessionKey(appId, appSecret, publicKey)
        }
    }

    private fun createMultipartBodyParts(
        files: List<File>,
        name: String,
        biometricsType: BiometricsType
    ): Array<MultipartBody.Part> =
        files.map {
            val requestBody = RequestBody.create(biometricsType.mediaType, it)
            MultipartBody.Part.createFormData(name, it.name, requestBody)
        }.toTypedArray()

    private fun createMultipartBodyPart(value: String, name: String): MultipartBody.Part =
        MultipartBody.Part.createFormData(name, value)

    companion object {
        private const val MULTIPART_PARAM_SAMPLES = "samples"
        private const val MULTIPART_PARAM_APP_ID = "appId"
        private const val MULTIPART_PARAM_APP_SECRET = "appSecret"
        private const val MULTIPART_PARAM_USER_ID = "userId"
        private const val MULTIPART_PARAM_CHALLENGE = "challenge"
        private const val MULTIPART_PARAM_KEY_ID = "keyId"
    }
}