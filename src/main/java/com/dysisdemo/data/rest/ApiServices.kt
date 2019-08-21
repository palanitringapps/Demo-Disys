package com.dysisdemo.data.rest

import com.dysisdemo.data.model.LoginRequest
import com.dysisdemo.data.model.LoginResponse
import com.dysisdemo.data.model.NewsPayload
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*
import java.util.concurrent.TimeUnit
import java.util.*


interface ApiServices {

    companion object {
        private const val BASEAPI = "https://api.qa.mrhe.gov.ae/mrhecloud/v1.4/api/"
        private const val timeoutTime = 30

        private val defaultHttpClient = OkHttpClient.Builder()
            .addInterceptor { chain ->
                val request = chain.request().newBuilder()
                    .header("consumer-key", "mobile_dev")
                    .header("consumer-secret", "20891a1b4504ddc33d42501f9c8d2215fbe85008")
                    .header("Content-Type", "application/json")
                    .build()
                chain.proceed(request)
            }.connectTimeout(timeoutTime.toLong(), TimeUnit.SECONDS)
            .writeTimeout(timeoutTime.toLong(), TimeUnit.SECONDS)
            .readTimeout(timeoutTime.toLong(), TimeUnit.SECONDS).build()


        private val sessionRetrofit = Retrofit.Builder()
            .baseUrl(BASEAPI)
            .addConverterFactory(GsonConverterFactory.create())
            .client(defaultHttpClient)
            .build()


        val service = ApiServices.sessionRetrofit.create(ApiServices::class.java)
    }

    @POST("iskan/v1/certificates/towhomitmayconcern")
    fun makeLoginCall(@Body loginRequest: LoginRequest): Call<LoginResponse>


    @GET("public/v1/news")
    fun getNewsList(@Query("local") language: String?) : Call<NewsPayload>

    /*@GET("repos/{owner}/{name}")
    fun getRepo(@Path("owner") owner: String, @Path("name") name: String): Single<Repo>*/
}