package com.example.mvi_practice.data.database.dao

import androidx.room.*
import com.example.mvi_practice.data.database.entity.UserEntity

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertUserInfo(userInfo: UserEntity)

    @Query("SELECT * FROM user_table WHERE login=:userName")
    suspend fun getUserInfo(userName: String) : UserEntity

    @Delete
    suspend fun deleteUserInfo(userInfo: UserEntity)
}