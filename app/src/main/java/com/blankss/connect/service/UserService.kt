package com.blankss.connect.service

import com.blankss.connect.data.User
import com.blankss.connect.pkg.ApiInference
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST

interface  UserService {
    @GET(ApiInference.ENDPOINT_USERS)
    fun getUsers(): Call<List<User>>

    @POST(ApiInference.ENDPOINT_USERS)
    fun createUser(): Call<User>

    @PATCH(ApiInference.ENDPOINT_USERS)
    fun updateUser(): Call<User>
}