package pl.edu.agh.bioauth.internal.network.callback

import pl.edu.agh.bioauth.internal.network.model.response.SessionKeyResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

internal class SymmetricKeyCallback : Callback<SessionKeyResponse> {

    lateinit var onSuccess: (String, String, String) -> Unit

    override fun onFailure(call: Call<SessionKeyResponse>, t: Throwable) {

    }

    override fun onResponse(call: Call<SessionKeyResponse>, response: Response<SessionKeyResponse>) {
        with (response) {
            if (isSuccessful) {
                body()?.run { onSuccess(id, key, iv) }
            }
        }
    }
}