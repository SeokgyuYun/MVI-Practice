package com.example.mvi_practice.domain.usecase

import com.example.mvi_practice.domain.model.User
import com.example.mvi_practice.domain.repository.UserRepository
import javax.inject.Inject

class GetUserInfoUseCase @Inject constructor(
    private val repository: UserRepository
) {
    suspend operator fun invoke(userName: String) = kotlin.runCatching {
        repository.getUserInfo(userName)
    }
}