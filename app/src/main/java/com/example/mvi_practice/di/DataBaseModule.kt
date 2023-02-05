package com.example.mvi_practice.di

import android.content.Context
import com.example.mvi_practice.data.database.GithubDatabase
import com.example.mvi_practice.data.database.dao.UserDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataBaseModule {

    @Provides
    @Singleton
    fun provideGithubDataBase(@ApplicationContext context: Context): GithubDatabase? =
        GithubDatabase.getInstance(context)

    @Provides
    @Singleton
    fun provideUserDao(githubDatabase: GithubDatabase): UserDao =
        githubDatabase.userDao()
}