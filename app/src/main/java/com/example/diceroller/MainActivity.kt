package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var Answer : TextView
    lateinit var Dice_Image : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Roll_Button : Button = findViewById(R.id.roll_button)

        Roll_Button.setOnClickListener {
            DiceRoller()
        }

        Answer = findViewById(R.id.value)
        Dice_Image = findViewById(R.id.dice_image)

    }

    private fun DiceRoller() {

        val RandomInt = java.util.Random().nextInt(6) + 1

        val ImageValue = when(RandomInt){

            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }

        Dice_Image.setImageResource(ImageValue)

        val Value = when(RandomInt){

            1 -> "Answer is 1"
            2 -> "Answer is 2"
            3 -> "Answer is 3"
            4 -> "Answer is 4"
            5 -> "Answer is 5"
            else -> "Answer is 6"

        }

        Answer.text = Value


    }
}