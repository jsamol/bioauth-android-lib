package pl.edu.agh.bioauth.internal.util.extension

import com.google.gson.Gson
import okhttp3.ResponseBody

internal fun <T> ResponseBody.parse(type: Class<T>, gson: Gson = Gson()): T = gson.fromJson(string(), type)