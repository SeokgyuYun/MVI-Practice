package com.example.mvi_practice.di

import com.example.mvi_practice.data.database.dao.UserDao
import com.example.mvi_practice.data.datasource.local.UserCacheSourceImpl
import com.example.mvi_practice.data.datasource.remote.UserRemoteSourceImpl
import com.example.mvi_practice.data.network.api.GithubApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {

    @Provides
    @Singleton
    fun provideGithubRemoteSource(githubApi: GithubApi): UserRemoteSourceImpl {
        return UserRemoteSourceImpl(githubApi)
    }

    @Provides
    @Singleton
    fun provideGithubCacheSource(userDao: UserDao): UserCacheSourceImpl {
        return UserCacheSourceImpl(userDao)
    }
}