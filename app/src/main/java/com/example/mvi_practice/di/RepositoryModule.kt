package com.example.mvi_practice.di

import com.example.mvi_practice.data.database.cache.UserCacheSource
import com.example.mvi_practice.data.network.remote.UserRemoteSource
import com.example.mvi_practice.data.repository.UserRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideUserRepository(
        remote: UserRemoteSource,
        cache: UserCacheSource
    ): UserRepositoryImpl {
        return UserRepositoryImpl(remote, cache)
    }
}