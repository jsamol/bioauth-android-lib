package pl.edu.agh.bioauth.internal.network.service

import okhttp3.MultipartBody
import pl.edu.agh.bioauth.internal.network.ApiConstant.AUTH_URI
import pl.edu.agh.bioauth.internal.network.model.response.AuthenticateResponse
import pl.edu.agh.bioauth.internal.network.model.response.RegisterResponse
import retrofit2.Call
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.Path

interface AuthenticationService {

    @Multipart
    @POST("$AUTH_URI/{method}/register")
    fun register(
        @Path("method") method: String,
        @Part samples: Array<MultipartBody.Part>,
        @Part appId: MultipartBody.Part,
        @Part appSecret: MultipartBody.Part,
        @Part userId: MultipartBody.Part
    ): Call<RegisterResponse>

    @Multipart
    @POST("$AUTH_URI/{method}/authenticate")
    fun authenticate(
        @Path("method") method: String,
        @Part samples: Array<MultipartBody.Part>,
        @Part appId: MultipartBody.Part,
        @Part appSecret: MultipartBody.Part,
        @Part challenge: MultipartBody.Part,
        @Part userId: MultipartBody.Part?
    ): Call<AuthenticateResponse>
}