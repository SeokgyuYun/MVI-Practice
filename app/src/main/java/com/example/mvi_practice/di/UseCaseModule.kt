package com.example.mvi_practice.di

import com.example.mvi_practice.domain.repository.UserRepository
import com.example.mvi_practice.domain.usecase.GetUserInfoUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    @Singleton
    fun provideGetUserInfoUseCase(repository: UserRepository): GetUserInfoUseCase {
        return GetUserInfoUseCase(repository)
    }
}