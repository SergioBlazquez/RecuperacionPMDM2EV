package com.example.prueba;
/*
import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.*
import org.json.JSONObject
import java.io.IOException

public class GetAllPeople {

    companion object {
        suspend fun send(mainActivity : MainActivityInterface?) {

            val client = OkHttpClient()
            val url = "https://swapi.dev/api/people/"
            val request = Request.Builder()
                    .url(url)
                    .build()
            val call = client.newCall(request)
            call.enqueue(object : Callback {

                override fun onFailure(call: Call, e: IOException) {
                    e.printStackTrace()
                    Log.e("GetAllPeople", call.toString())

                }

                override fun onResponse(call: Call, response: Response) {
                    CoroutineScope(Dispatchers.IO).launch {
                        val bodyInString = response.body?.string()
                        bodyInString?.let {
                            Log.w("GetAllPeople", bodyInString)
                            val JsonObject = JSONObject(bodyInString)

                            val results = JsonObject.optJSONArray("results")
                            results?.let {
                                Log.w("GetAllPeople", results.toString())
                                val gson = Gson()

                                val itemType = object : TypeToken<List<Film>>() {}.type

                                val list = gson.fromJson<List<Film>>(results.toString(), itemType)

                                mainActivity?.onFilmsReceived(list)
                            }
                        }
                    }
                }
            })
        }
    }
}
*/