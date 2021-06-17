package com.example.randomnumgen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.rollButton)
        val result = findViewById<TextView>(R.id.results)
        val startNum = findViewById<EditText>(R.id.startNum).text
        val endNum = findViewById<EditText>(R.id.endNum).text

        rollButton.setOnClickListener {
            val rand = Random.nextInt(startNum.toString().toInt(),endNum.toString().toInt())
            result.text = rand.toString()
        }

    }
}