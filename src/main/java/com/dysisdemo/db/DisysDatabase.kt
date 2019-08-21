package com.dysisdemo.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [UserLoginData::class], version = 1)
abstract class DisysDatabase : RoomDatabase() {
    abstract fun userLoginDataDao(): UserLoginDataDao


    companion object {
        private var INSTANCE: DisysDatabase? = null

        private const val DB_NAME = "disys_db"

        private val lock = Any()

        fun getInstance(context: Context): DisysDatabase {
            synchronized(lock) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        DisysDatabase::class.java, DB_NAME
                    )
                        .build()
                }
                return INSTANCE!!
            }
        }
    }
}