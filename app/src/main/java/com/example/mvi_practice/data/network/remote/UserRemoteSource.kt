package com.example.mvi_practice.data.network.remote

import com.example.mvi_practice.domain.model.User

interface UserRemoteSource {
    suspend fun getUserInfo(
        userName: String
    ): User
}