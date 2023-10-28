package com.example.pizzarestaurant

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuDetail : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_detail)

        val orderNowBtn = findViewById<Button>(R.id.orderNowBtn)
        val backBtn = findViewById<Button>(R.id.backBtn)

        orderNowBtn.setOnClickListener{
            val intent = Intent(this, OrderDetail::class.java)
            startActivity(intent)
        }

        backBtn.setOnClickListener{
            onBackPressed()
        }
    }
}