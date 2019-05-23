package pl.edu.agh.bioauth.internal.network.callback

import com.google.gson.Gson
import pl.edu.agh.bioauth.auth.listener.ResultListener
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import pl.edu.agh.bioauth.internal.network.model.response.ErrorResponse
import pl.edu.agh.bioauth.internal.util.FileUtil
import pl.edu.agh.bioauth.internal.util.extension.parse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

internal abstract class ResultCallback<T, L: ResultListener, E: Exception>(
    private val biometricsType: BiometricsType,
    private val gson: Gson
) : Callback<T> {

    abstract val onSuccess: (T) -> Unit

    lateinit var listener: L

    abstract fun getException(message: String? = null, cause: Throwable? = null): E

    override fun onResponse(call: Call<T>, response: Response<T>) {
        with (response) {
            if (isSuccessful) {
                body()?.let(onSuccess) ?: listener.onFailure(getException())
            } else {
                listener.onFailure(getException(getErrorMessage(this)))
            }
        }

        doFinally()
    }

    override fun onFailure(call: Call<T>, t: Throwable) {
        listener.onFailure(getException(cause = t))
        doFinally()
    }

    private fun getErrorMessage(response: Response<T>): String? =
        response.errorBody()?.parse(ErrorResponse::class.java, gson)?.message

    private fun doFinally() {
        FileUtil.deleteTempFiles(biometricsType)
    }
}