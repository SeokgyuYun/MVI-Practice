package com.example.mvi_practice.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class UserEntity(
    @PrimaryKey
    val login: String,
    val name: String,
    val repos: Int,
    val gits: Int,
    val followers: Int,
    val following: Int
)
