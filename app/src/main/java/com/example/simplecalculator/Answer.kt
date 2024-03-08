package com.example.simplecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Answer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

        var txtAns = findViewById<TextView>(R.id.Answer)
        txtAns.setText(intent.getDoubleExtra("answer",0.0).toString())

        var btnBack = findViewById<Button>(R.id.backBtn)
        btnBack.setOnClickListener{
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()

        }

    }
}