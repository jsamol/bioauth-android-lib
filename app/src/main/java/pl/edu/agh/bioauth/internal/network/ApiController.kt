package pl.edu.agh.bioauth.internal.network

import okhttp3.MultipartBody
import okhttp3.RequestBody
import pl.edu.agh.bioauth.BioAuth
import pl.edu.agh.bioauth.exception.SdkUninitializedException
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import pl.edu.agh.bioauth.internal.data.AppCredentials
import pl.edu.agh.bioauth.internal.network.model.request.StatsRequest
import pl.edu.agh.bioauth.internal.network.model.response.AuthenticateResponse
import pl.edu.agh.bioauth.internal.network.model.response.RegisterResponse
import pl.edu.agh.bioauth.internal.network.model.response.SymmetricKeyResponse
import pl.edu.agh.bioauth.internal.network.service.AuthenticationService
import pl.edu.agh.bioauth.internal.network.service.EncryptionService
import pl.edu.agh.bioauth.internal.network.service.StatisticsService
import pl.edu.agh.bioauth.internal.util.ErrorUtil
import pl.edu.agh.bioauth.stats.data.StatsData
import retrofit2.Call
import java.io.File

internal class ApiController(
    private val authenticationService: AuthenticationService,
    private val encryptionService: EncryptionService,
    private val statisticsService: StatisticsService
) {

    @get:Throws(SdkUninitializedException::class)
    private val appCredentials: AppCredentials
        get() = BioAuth.instance?.appCredentials ?: ErrorUtil.failWithSdkUninitialized()

    fun registerSamples(userId: String, photos: List<File>, biometricsType: BiometricsType): Call<RegisterResponse> {
        with (appCredentials) {
            val samples = createMultipartBodyParts(photos, MULTIPART_PARAM_SAMPLES, biometricsType)
            val appIdParam = createMultipartBodyPart(appId, MULTIPART_PARAM_APP_ID)
            val appSecretParam = createMultipartBodyPart(appSecret, MULTIPART_PARAM_APP_SECRET)
            val userIdParam = createMultipartBodyPart(userId, MULTIPART_PARAM_USER_ID)

            return authenticationService.register(biometricsType.methodName, samples, appIdParam, appSecretParam, userIdParam)
        }
    }

    fun authenticate(userId: String?, photos: List<File>, challenge: String, biometricsType: BiometricsType): Call<AuthenticateResponse> {
        with (appCredentials) {
            val samples = createMultipartBodyParts(photos, MULTIPART_PARAM_SAMPLES, biometricsType)
            val appIdParam = createMultipartBodyPart(appId, MULTIPART_PARAM_APP_ID)
            val appSecretParam = createMultipartBodyPart(appSecret, MULTIPART_PARAM_APP_SECRET)
            val challengeParam = createMultipartBodyPart(challenge, MULTIPART_PARAM_CHALLENGE)
            val userIdParam = userId?.let { createMultipartBodyPart(it, MULTIPART_PARAM_USER_ID) }

            return authenticationService.authenticate(
                biometricsType.methodName,
                samples, appIdParam,
                appSecretParam,
                challengeParam,
                userIdParam
            )
        }
    }

    fun getEncryptionKey(publicKey: String): Call<SymmetricKeyResponse> {
        with(appCredentials) {
            return encryptionService.getSymmetricnKey(appId, appSecret, publicKey)
        }
    }

    fun uploadStatistics(statsData: StatsData): Call<Void> {
        with (appCredentials) {
            val batteryLevel = statsData.initialData.batteryData.batteryLevel
            val isCharging = statsData.initialData.batteryData.isCharging
            val chargeType = statsData.initialData.batteryData.chargeType
            val connectionType = statsData.initialData.connectionType
            val availableMemory = statsData.initialData.memoryData.availableMemory
            val lowMemory = statsData.initialData.memoryData.lowMemory
            val batteryDrain = statsData.batteryDrain
            val executionTime = statsData.executionTime

            val request = StatsRequest(appId, appSecret, batteryLevel, isCharging, chargeType,
                connectionType, availableMemory, lowMemory, batteryDrain, executionTime)

            return statisticsService.uploadStatistics(request)
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
    }
}