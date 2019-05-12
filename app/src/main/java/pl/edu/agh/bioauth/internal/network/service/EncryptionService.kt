package pl.edu.agh.bioauth.internal.network.service

import pl.edu.agh.bioauth.internal.network.ApiConstant.API_URI
import pl.edu.agh.bioauth.internal.network.ApiRequestParam.APP_ID
import pl.edu.agh.bioauth.internal.network.ApiRequestParam.APP_SECRET
import pl.edu.agh.bioauth.internal.network.ApiRequestParam.PUBLIC_KEY
import pl.edu.agh.bioauth.internal.network.model.response.SymmetricKeyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

internal interface EncryptionService {

    @GET("$API_URI/encryption/symmetricKey")
    fun getSymmetricnKey(@Query(APP_ID) appId: String,
                         @Query(APP_SECRET) appSecret: String,
                         @Query(PUBLIC_KEY) publicKey: String) : Call<SymmetricKeyResponse>
}