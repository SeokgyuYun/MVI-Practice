package com.example.mvi_practice.data.network.response

import com.google.gson.annotations.SerializedName

data class UserResponse(
    val login: String,
    val name: String,
    @SerializedName("public_repos")
    val repos: Int,
    @SerializedName("public_gists")
    val gits: Int,
    val followers: Int,
    val following: Int
)
