package com.example.weatherapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {

    private lateinit var textViewName: TextView
    private lateinit var textViewNickname: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        textViewName = findViewById(R.id.textViewName)
        textViewNickname = findViewById(R.id.textViewNickname)

        // Get the intent and extract the data
        val name = intent.getStringExtra("USER_NAME")
        val nickname = intent.getStringExtra("USER_NICKNAME")

        // Set the extracted data to the TextViews
        if (name != null && nickname != null) {
            textViewName.text = "Name: $name"
            textViewNickname.text = "Nickname: $nickname"
        }
    }
}