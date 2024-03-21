package com.example.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.example.room.Adapter.RecyclerAdapter
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    @OptIn(DelicateCoroutinesApi::class)
    private lateinit var database: ContactDatabase


    @OptIn(DelicateCoroutinesApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvlayout = findViewById<RecyclerView>(R.id.rvlayout)
        database =
            Room.databaseBuilder(applicationContext, ContactDatabase::class.java, "Contact")
                .fallbackToDestructiveMigration().build()

        GlobalScope.launch {
// Static Data used couroutine as Room DB does not work on main thread
//            database.contactDao().insertContact(Contact(1, "Neel", "Doshi", "9999999999"))
//            database.contactDao().insertContact(Contact(2, "Sid", "Jondhale", 8888888888))
//            database.contactDao().insertContact(Contact(3, "Aryaman", "Mishra", 7777777777))
//            database.contactDao().insertContact(Contact(4, "Aryaman", "Mishra", 7777777777))
//            database.contactDao().insertContact(Contact(5, "Aryaman", "Mishra", 7777777777))
//            database.contactDao().insertContact(Contact(6, "Aryaman", "Mishra", 7777777777))

        }

        val contacts = database.contactDao().getAllContact().observe(this) { contacts ->
            rvlayout.adapter = RecyclerAdapter(contacts)
        }
        rvlayout.layoutManager = LinearLayoutManager(this)
        rvlayout.isNestedScrollingEnabled = false;

        val etFirstName = findViewById<EditText>(R.id.etFirstName)
        val etLastName = findViewById<EditText>(R.id.etLastName)
        val etPhoneNo = findViewById<EditText>(R.id.etPhoneNo)


        val addbtn = findViewById<Button>(R.id.addBtn)
        var i:Int = 0
        addbtn.setOnClickListener {
            val firstName = etFirstName.text.toString()
            val lastName = etLastName.text.toString()
            val phoneNo = etPhoneNo.text.toString()


            GlobalScope.launch {
                database.contactDao().insertContact(Contact(i, firstName, lastName, phoneNo))
            }
            i++

        }
    }


}


