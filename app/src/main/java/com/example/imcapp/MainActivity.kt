package com.example.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        calcButton.setOnClickListener{
            val pesoTemp = peso.text.toString().toDouble()
            val alturaTemp = altura.text.toString().toDouble()
            val imc = (pesoTemp/(alturaTemp*alturaTemp))
            val imcTemp = "%.2f".format(imc)
            var imcText = ""

            when{
                imc < 18.5  -> imcText = "Magreza"
                imc <= 24.9 -> imcText = "Normal"
                imc <= 29.9 -> imcText = "Sobrepeso"
                imc <= 34.9 -> imcText = "Obesidade grau 1"
                imc <= 39.9 -> imcText = "Obesidade grau 2"
                imc >= 40   -> imcText = "Obesidade Morbida"
            }
            imcText = "$imcTemp - $imcText"
            Result.text = imcText
        }
    }
}