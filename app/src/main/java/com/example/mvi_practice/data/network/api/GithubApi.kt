package com.example.mvi_practice.data.network.api

import com.example.mvi_practice.data.network.response.UserResponse
import com.example.mvi_practice.domain.util.Constants.GITHUB_TOKEN
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface GithubApi {

    @GET("/users/{username}")
    suspend fun getUserInfo(
        @Header("Authorization: Bearer $GITHUB_TOKEN")
        @Path("username") userName: String
    ): UserResponse
}
