package com.example.mvi_practice.data.repository

import com.example.mvi_practice.data.database.cache.UserCacheSource
import com.example.mvi_practice.data.network.remote.UserRemoteSource
import com.example.mvi_practice.domain.model.User
import com.example.mvi_practice.domain.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val remote: UserRemoteSource,
    private val cache: UserCacheSource
): UserRepository {

    override suspend fun getUserInfo(userName: String): User =
        cache.getUserInfo(userName) ?: getUserInfoByRemote(userName)

    private suspend fun getUserInfoByRemote(userName: String): User =
        remote.getUserInfo(userName).also {
            cache.insertUserInfo(it)
        }

}