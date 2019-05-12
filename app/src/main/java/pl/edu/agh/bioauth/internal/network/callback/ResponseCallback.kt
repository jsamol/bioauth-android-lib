package pl.edu.agh.bioauth.internal.network.callback

import com.google.gson.Gson
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import pl.edu.agh.bioauth.internal.network.model.response.ErrorResponse
import pl.edu.agh.bioauth.internal.util.FileUtil
import pl.edu.agh.bioauth.internal.util.extension.parse
import retrofit2.Callback
import retrofit2.Response

internal abstract class ResponseCallback<T>(private val biometricsType: BiometricsType, private val gson: Gson) : Callback<T> {

    protected fun getErrorMessage(response: Response<T>): String? =
        response.errorBody()?.parse(ErrorResponse::class.java, gson)?.message

    protected fun doFinally() {
        FileUtil.deleteTempFiles(biometricsType)
    }
}