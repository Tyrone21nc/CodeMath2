package com.example.codemath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById(R.id.ed1) as EditText

        val num2 = findViewById(R.id.ed2) as EditText

        val tot = findViewById(R.id.ed3) as EditText

        val b1 = findViewById(R.id.btn1) as Button


        b1.setOnClickListener {
            val val1 = num1.text.toString().toInt()
            val val2 = num2.text.toString().toInt()

            val result = val1 + val2;

            tot.setText(result.toString())

        }

    }
}