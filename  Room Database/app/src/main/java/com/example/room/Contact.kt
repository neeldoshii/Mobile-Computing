package com.example.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Contact")
data class Contact(
    @PrimaryKey(autoGenerate = true)
    val id: Int ,
    val firstName: String,
    val lastName: String,
    val phoneNo: String
)

{
    companion object {
        const val TABLE_NAME = "Contact"
    }
}



