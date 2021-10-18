package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvAnswer : TextView
    lateinit var edNum1 : EditText
    lateinit var edNum2 : EditText
    lateinit var btPlus : Button
    lateinit var btMinus : Button
    lateinit var btMultiply : Button
    lateinit var btDivid : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvAnswer = findViewById(R.id.tvAnswer)
        edNum1 = findViewById(R.id.edNum1)
        edNum2 = findViewById(R.id.edNum2)
        btPlus = findViewById(R.id.btPlus)
        btMinus = findViewById(R.id.btMinus)
        btMultiply = findViewById(R.id.btMultiply)
        btDivid = findViewById(R.id.btDivid)


        btPlus.setOnClickListener {
          val answer=  edNum1.text.toString().toDouble() +   edNum2.text.toString().toDouble()
            tvAnswer.text = answer.toString()
        }
        btMinus.setOnClickListener {
            val answer=  edNum1.text.toString().toDouble() -   edNum2.text.toString().toDouble()
            tvAnswer.text = answer.toString()
        }
        btMultiply.setOnClickListener {
            val answer=  edNum1.text.toString().toDouble() *   edNum2.text.toString().toDouble()
            tvAnswer.text = answer.toString()
        }
        btDivid.setOnClickListener {
            val answer=  edNum1.text.toString().toDouble() /   edNum2.text.toString().toDouble()
            tvAnswer.text = answer.toString()
        }
    }
}