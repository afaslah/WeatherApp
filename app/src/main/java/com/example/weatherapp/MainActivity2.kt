package com.example.weatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    private lateinit var editTextNameInput: EditText
    private lateinit var editNicknameInput: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        editTextNameInput = findViewById(R.id.text1)
        editNicknameInput = findViewById(R.id.text2)
        val buttonView: Button = findViewById(R.id.button1)


        buttonView.setOnClickListener {
            val name = editTextNameInput.text.toString()
            val nickname = editNicknameInput.text.toString()

            if (name.isNotBlank() && nickname.isNotBlank()) {
                val intent = Intent(this, MainActivity3::class.java)
                intent.putExtra("USER_NAME", name)
                intent.putExtra("USER_NICKNAME", nickname)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Enter valid name and nickname", Toast.LENGTH_SHORT).show()
            }
        }
    }
}