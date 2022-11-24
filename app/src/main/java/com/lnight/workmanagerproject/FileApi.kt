package com.lnight.workmanagerproject

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET

interface FileApi {

    @GET("/aobuta/images/d/d8/Mai_Sakurajima_Anime_-_Screenshot_1.png/revision/latest?cb=20181016030235")
    suspend fun downloadImage(): Response<ResponseBody>

    companion object {
        val instance: FileApi by lazy {
            Retrofit.Builder()
                .baseUrl("https://static.wikia.nocookie.net")
                .build()
                .create(FileApi::class.java)
        }
    }
}