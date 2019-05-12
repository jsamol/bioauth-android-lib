package pl.edu.agh.bioauth.internal.network.service

import pl.edu.agh.bioauth.internal.network.ApiConstant.API_URI
import pl.edu.agh.bioauth.internal.network.model.request.StatsRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

internal interface StatisticsService {

    @POST("$API_URI/statistics")
    fun uploadStatistics(@Body statsRequest: StatsRequest): Call<Void>
}