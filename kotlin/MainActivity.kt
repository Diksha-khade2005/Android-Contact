package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val contacts = listOf(
            Contact("Diksha", " +91 9876543210", R.drawable.download1),
            Contact("Jaya", "+91 8877665544", R.drawable.download2),
            Contact("Kiran", "+91 7766554433", R.drawable.download3),
            Contact("Harshuu", "+91 9900112233", R.drawable.download4)
        )


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)


        recyclerView.layoutManager = LinearLayoutManager(this)


        val adapter = ContactAdapter(contacts)
        recyclerView.adapter = adapter
    }
}
