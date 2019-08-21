package com.dysisdemo.db

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
class UserLoginData {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "referenceNo")
    var referenceNo: Int = 0

    @ColumnInfo(name = "message")
    var message: String = ""

    @ColumnInfo(name = "success")
    var success: String = ""

}