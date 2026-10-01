package com.example.madtlab1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var TextViewMessage: TextView
    private lateinit var ButtonChangeText: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TextViewMessage = findViewById(R.id.TextViewMessage)
        ButtonChangeText = findViewById(R.id.ButtonChangeText)

        ButtonChangeText.setOnClickListener { ChangeText() }
    }

    private fun ChangeText() {
        TextViewMessage.text = "Hello World!"
    }
}