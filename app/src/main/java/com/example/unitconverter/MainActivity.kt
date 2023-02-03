package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText:EditText? = findViewById(R.id.editText)
        val btnConvert:Button = findViewById(R.id.btn_convert)
        val textCelsius:TextView = findViewById(R.id.text_Celsius)

        btnConvert.setOnClickListener{
            var farhenheit = editText?.text.toString()
            var celsius = (farhenheit.toFloat() - 32.0) * (5.0/9.0)
            textCelsius.text = String.format("%.2f",celsius)
        }
    }
}
