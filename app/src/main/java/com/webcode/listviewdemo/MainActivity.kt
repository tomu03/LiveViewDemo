package com.webcode.listviewdemo

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    lateinit var listView:ListView

    val user = arrayOf(
        "Musfiqur Rahim", "Masrafi Bin Mortaza", "Sakib Al Hasan",
        "Tamim Iqbal", "Mahmudullah Riad", "LIton Das",
        "Taskin Ahmed","Rubel Hossain","Nazmul hossain"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,user)

        listView.adapter = arrayAdapter
        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Cliched Item"+ parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show()
        }
        }
    }