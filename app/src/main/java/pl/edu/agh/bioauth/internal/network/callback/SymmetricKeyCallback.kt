package pl.edu.agh.bioauth.internal.network.callback

import pl.edu.agh.bioauth.internal.network.model.response.SymmetricKeyResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

internal class SymmetricKeyCallback : Callback<SymmetricKeyResponse> {

    lateinit var onSuccess: (String, String, String) -> Unit

    override fun onFailure(call: Call<SymmetricKeyResponse>, t: Throwable) {

    }

    override fun onResponse(call: Call<SymmetricKeyResponse>, response: Response<SymmetricKeyResponse>) {
        with (response) {
            if (isSuccessful) {
                body()?.run { onSuccess(id, key, iv) }
            }
        }
    }
}