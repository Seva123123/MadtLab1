package com.example.madtlab1

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var RootLayout: LinearLayout
    private lateinit var TextViewMessage: TextView
    private lateinit var ButtonChangeText: Button
    private lateinit var ButtonChangeTextColor: Button
    private lateinit var ButtonChangeBackground: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RootLayout = findViewById(R.id.RootLayout)
        TextViewMessage = findViewById(R.id.TextViewMessage)
        ButtonChangeText = findViewById(R.id.ButtonChangeText)
        ButtonChangeTextColor = findViewById(R.id.ButtonChangeTextColor)
        ButtonChangeBackground = findViewById(R.id.ButtonChangeBackground)

        ButtonChangeText.setOnClickListener { ChangeText() }
        ButtonChangeTextColor.setOnClickListener { ChangeTextColor() }
        ButtonChangeBackground.setOnClickListener { ChangeBackground() }
    }

    private fun ChangeText() {
        TextViewMessage.text = "Hello World!"
    }

    private fun ChangeTextColor() {
        TextViewMessage.setTextColor(
            Color.rgb(Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
        )
    }

    private fun ChangeBackground() {
        RootLayout.setBackgroundColor(
            Color.rgb(Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
        )
    }
}