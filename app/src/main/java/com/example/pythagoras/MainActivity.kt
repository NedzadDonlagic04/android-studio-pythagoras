package com.example.pythagoras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sideAInput: EditText = findViewById(R.id.sideAInput)
        val sideBInput: EditText = findViewById(R.id.sideBInput)

        val calculateBtn: Button = findViewById(R.id.calculateButton)

        val resultView: TextView = findViewById(R.id.resultView)

        calculateBtn.setOnClickListener {
            val sideA = sideAInput.text.toString().toDouble()
            val sideB = sideBInput.text.toString().toDouble()

            var result = sqrt(sideA*sideA + sideB*sideB)
            result = (result * 100).toInt() / 100.00

            resultView.text = result.toString()
        }
    }
}