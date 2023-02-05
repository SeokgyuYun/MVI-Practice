package com.example.mvi_practice.data.mapper

import com.example.mvi_practice.data.database.entity.UserEntity
import com.example.mvi_practice.data.network.response.UserResponse
import com.example.mvi_practice.domain.model.User

fun UserResponse.toModel(): User = User(
    login = this.login,
    name = this.name,
    gits = this.gits,
    repos = this.repos,
    followers = this.followers,
    following = this.following
)

fun UserEntity.toModel(): User = User(
    login = this.login,
    name = this.name,
    gits = this.gits,
    repos = this.repos,
    following = this.following,
    followers = this.followers
)

fun User.toEntity(): UserEntity = UserEntity(
    login = this.login,
    name = this.name,
    gits = this.gits,
    repos = this.repos,
    following = this.following,
    followers = this.followers
)