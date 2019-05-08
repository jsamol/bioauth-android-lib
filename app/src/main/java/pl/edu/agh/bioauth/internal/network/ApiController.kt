package pl.edu.agh.bioauth.internal.network

import pl.edu.agh.bioauth.BioAuth
import pl.edu.agh.bioauth.exception.SdkUninitializedException
import pl.edu.agh.bioauth.internal.network.model.SymmetricKeyResponse
import pl.edu.agh.bioauth.internal.network.service.EncryptionService
import retrofit2.Call

internal class ApiController(private val encryptionService: EncryptionService) {

    @Throws(SdkUninitializedException::class)
    fun getEncryptionKey(publicKey: String): Call<SymmetricKeyResponse> {
        BioAuth.instance?.appCredentials?.run {
            return encryptionService.getSymmetricnKey(appId, appSecret, publicKey)
        } ?: throw SdkUninitializedException()
    }
}