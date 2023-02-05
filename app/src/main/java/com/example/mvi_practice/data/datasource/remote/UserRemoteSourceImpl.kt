package com.example.mvi_practice.data.datasource.remote

import com.example.mvi_practice.data.mapper.toModel
import com.example.mvi_practice.data.network.api.GithubApi
import com.example.mvi_practice.data.network.remote.UserRemoteSource
import com.example.mvi_practice.domain.model.User
import javax.inject.Inject

class UserRemoteSourceImpl @Inject constructor(
    private val api: GithubApi
): UserRemoteSource {

    override suspend fun getUserInfo(userName: String): User =
        api.getUserInfo(userName).toModel()
}
