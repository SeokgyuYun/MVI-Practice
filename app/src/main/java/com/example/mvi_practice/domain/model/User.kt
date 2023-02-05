package com.example.mvi_practice.domain.model

data class User(
    val login: String,
    val name: String,
    val repos: Int,
    val gits: Int,
    val followers: Int,
    val following: Int
)
