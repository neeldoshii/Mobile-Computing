package com.example.room

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ContactDao {
    @Insert (onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertContact(Contact : Contact)

    @Update
    suspend fun updateContact(Contact: Contact)

    @Delete
    suspend fun  deleteContact(Contact: Contact)

    @Query("SELECT * FROM ${Contact.TABLE_NAME}")
    fun getAllContact() : LiveData<List<Contact>>

}