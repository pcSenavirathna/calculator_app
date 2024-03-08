package com.example.simplecalculator

import android.content.Intent
import android.icu.util.IslamicCalendar.CalculationType
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.simplecalculator.models.calculator

class MainActivity : AppCompatActivity() {


    lateinit var num1: EditText
    lateinit var num2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num1 = findViewById(R.id.Number1)
        num2 = findViewById(R.id.Number2)
    }

    fun ButtonClick(v: View){
        var ans = 0.0
        val Calculator = calculator(
            num1.text.toString().toDouble(),
            num2.text.toString().toDouble()
        )
        when(v.id){
            R.id.BtnPlus -> ans = Calculator.add()
            R.id.BtnSub -> ans = Calculator.subtract()
            R.id.BtnMul -> ans = Calculator.multiply()
            R.id.BtnDiv -> ans = Calculator.divide()

        }
        println(ans)

        val intent = Intent(this, Answer::class.java)
        intent.putExtra("answer", ans)
        startActivity(intent)
        finish()
    }
}