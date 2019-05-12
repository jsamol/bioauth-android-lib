package pl.edu.agh.bioauth.internal.network.callback

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class VoidCallback : Callback<Void> {
    override fun onFailure(call: Call<Void>, t: Throwable) {

    }

    override fun onResponse(call: Call<Void>, response: Response<Void>) {

    }
}