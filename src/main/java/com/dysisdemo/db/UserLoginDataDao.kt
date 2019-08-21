package com.dysisdemo.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserLoginDataDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(userLoginData: UserLoginData)

    @Query("SELECT * from user_table")
    fun getLocalUserData(): List<UserLoginData>
}