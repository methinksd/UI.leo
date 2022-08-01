package com.example.uileo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var buttonUI2Activity:Button ?= null
    var buttonMainActivity:Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonUI2Activity=findViewById(R.id.btn_button)

        buttonUI2Activity!!.setOnClickListener {
            val intent = Intent(this,UI2Activity::class.java)
            startActivity(intent)
        }

        buttonMainActivity=findViewById(R.id.btn_button)

        buttonMainActivity!!.setOnClickListener {
            val intent2 = Intent(this,MainActivity::class.java)
            startActivity(intent2)
        }
    }
}
