package com.example.mvi_practice.data.database.cache

import com.example.mvi_practice.domain.model.User

interface UserCacheSource {

    suspend fun getUserInfo(
        userName: String
    ): User?

    suspend fun insertUserInfo(user: User)

    suspend fun deleteUserInfo(user: User)
}
