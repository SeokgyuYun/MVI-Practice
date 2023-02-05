package com.example.mvi_practice.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mvi_practice.data.database.dao.UserDao
import com.example.mvi_practice.data.database.entity.UserEntity

@Database(
    entities = [UserEntity::class],
    version = 1,
    exportSchema = false
)
abstract class GithubDatabase : RoomDatabase() {

    abstract fun userDao() : UserDao

    companion object {
        private var instance: GithubDatabase? = null

        @Synchronized
        fun getInstance(context: Context): GithubDatabase? {
            if (instance == null) {
                synchronized(GithubDatabase::class) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        GithubDatabase::class.java,
                        "mvi-database"
                    )
                        .build()
                }
            }
            return instance
        }
    }
}