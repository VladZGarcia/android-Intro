package com.example.androidintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var textView2: TextView
    lateinit var inputView: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        textView2 = findViewById(R.id.textView2)
        inputView = findViewById(R.id.inputView)


        //textView.text = "Värde på tärningen: $diceVal"

        val button = findViewById<Button>(R.id.button)


        button.text = "Tryck här!"

    }

    fun buttonPressed(view: View) {
        val diceImage = findViewById<ImageView>(R.id.imageButton)
        val diceImage2 = findViewById<ImageView>(R.id.imageButton2)
        var guessInput = inputView.text.toString()
        var guess = guessInput.toInt()
        Log.d("!!!","Knapp trycktes")
        val randomVal = (1..6).random()

        if (randomVal == 1) {
            diceImage.setImageResource(R.drawable.d1)
        }
        if (randomVal == 2) {
            diceImage.setImageResource(R.drawable.d2)
        }
        if (randomVal == 3) {
            diceImage.setImageResource(R.drawable.d3)
        }
        if (randomVal == 4) {
            diceImage.setImageResource(R.drawable.d4)
        }
        if (randomVal == 5) {
            diceImage.setImageResource(R.drawable.d5)
        }
        if (randomVal == 6) {
            diceImage.setImageResource(R.drawable.d6)
        }
        val randomVal2 = (1..6).random()
        textView2.text = randomVal2.toString()
        if (randomVal2 == 1) {
            diceImage2.setImageResource(R.drawable.d1)
        }
        if (randomVal2 == 2) {
            diceImage2.setImageResource(R.drawable.d2)
        }
        if (randomVal2 == 3) {
            diceImage2.setImageResource(R.drawable.d3)
        }
        if (randomVal2 == 4) {
            diceImage2.setImageResource(R.drawable.d4)
        }
        if (randomVal2 == 5) {
            diceImage2.setImageResource(R.drawable.d5)
        }
        if (randomVal2 == 6) {
            diceImage2.setImageResource(R.drawable.d6)
        }
        var summa = randomVal + randomVal2

        textView2.text = "summan är: $summa "

        if(summa == guess) {
            textView.text = "Bra gissat!"

        } else{
            textView.text = "Inte rätt gissning!"
        }

    }

}