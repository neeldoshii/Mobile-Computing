package com.example.room.Adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.room.Contact
import com.example.room.R


class
RecyclerAdapter(val contact: List<Contact>) : Adapter<RecyclerAdapter.RecyclerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.recycler_item, parent, false)
        return RecyclerViewHolder(view)

    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        Log.d("Tag1", contact[position].id.toString())
        Log.d("Tag2", contact[position].firstName.toString())
        Log.d("Tag3", contact[position].lastName.toString())
        Log.d("Tag3", contact[position].phoneNo.toString())

        holder.id.text = contact[position].id.toString()
        holder.firstName.text = contact[position].firstName
        holder.lastName.text = contact[position].lastName
        holder.phoneNo.text = contact[position].phoneNo.toString()
    }

    override fun getItemCount(): Int {
        return contact.size
    }

    class RecyclerViewHolder(itemView: View) : ViewHolder(itemView) {

        val firstName = itemView.findViewById<TextView>(R.id.FirstName)
        val lastName = itemView.findViewById<TextView>(R.id.LastName)
        val phoneNo = itemView.findViewById<TextView>(R.id.phoneNo)
        val id = itemView.findViewById<TextView>(R.id.idTV)

    }

}

