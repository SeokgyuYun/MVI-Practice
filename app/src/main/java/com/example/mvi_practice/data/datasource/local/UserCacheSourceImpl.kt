package com.example.mvi_practice.data.datasource.local

import com.example.mvi_practice.data.database.cache.UserCacheSource
import com.example.mvi_practice.data.database.dao.UserDao
import com.example.mvi_practice.data.mapper.toEntity
import com.example.mvi_practice.data.mapper.toModel
import com.example.mvi_practice.domain.model.User
import javax.inject.Inject

class UserCacheSourceImpl @Inject constructor(
    private val dao: UserDao
) : UserCacheSource {

    override suspend fun getUserInfo(userName: String): User =
        dao.getUserInfo(userName).toModel()

    override suspend fun insertUserInfo(user: User) =
        dao.insertUserInfo(user.toEntity())


    override suspend fun deleteUserInfo(user: User) =
        dao.deleteUserInfo(user.toEntity())
}
