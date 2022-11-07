package com.example.userui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clicking = findViewById(R.id.layoutGoal) as LinearLayout

        clicking.setOnClickListener {
            val intent = Intent(this, userProfile::class.java)
            // start your next activity
            startActivity(intent)
        }


    }
}