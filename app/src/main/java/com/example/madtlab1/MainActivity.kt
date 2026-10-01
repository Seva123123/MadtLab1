package com.example.madtlab1

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var TextViewMessage: TextView
    private lateinit var ButtonChangeText: Button
    private lateinit var ButtonChangeTextColor: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TextViewMessage = findViewById(R.id.TextViewMessage)
        ButtonChangeText = findViewById(R.id.ButtonChangeText)
        ButtonChangeTextColor = findViewById(R.id.ButtonChangeTextColor)

        ButtonChangeText.setOnClickListener { ChangeText() }
        ButtonChangeTextColor.setOnClickListener { ChangeTextColor() }
    }

    private fun ChangeText() {
        TextViewMessage.text = "Hello World!"
    }

    private fun ChangeTextColor() {
        TextViewMessage.setTextColor(
            Color.rgb(Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
        )
    }
}