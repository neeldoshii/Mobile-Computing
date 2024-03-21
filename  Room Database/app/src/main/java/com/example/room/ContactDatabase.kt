package com.example.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Contact::class], version = 2)
abstract class ContactDatabase : RoomDatabase() {
    // created a abstract function which will inherit Dao
    abstract fun contactDao() : ContactDao


}