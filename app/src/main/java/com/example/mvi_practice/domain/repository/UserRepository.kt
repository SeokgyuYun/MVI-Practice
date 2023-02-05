package com.example.mvi_practice.domain.repository

import com.example.mvi_practice.domain.model.User

interface UserRepository {

    suspend fun getUserInfo(
        userName: String
    ): User
}