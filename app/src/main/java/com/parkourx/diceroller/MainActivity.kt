package com.parkourx.diceroller
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener  { rollDice() }
        //rollButton.setOnClickListener {myToast()}
    }
    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val myText: TextView = findViewById(R.id.textView)
        myText.text = diceRoll.toString()
    }
    private fun myToast() {
        val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
        toast.show()
    }
}


class Dice(private val sides: Int) {
    fun roll(): Int {
        return (1..sides).random()
    }
}