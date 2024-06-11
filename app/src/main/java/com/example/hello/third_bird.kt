package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class third_bird : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third_bird)
        val btnPrev3 = findViewById<ImageView>(R.id.btnPrev3)
        val btnNext4 = findViewById<ImageView>(R.id.btnNext4)
        btnPrev3.setOnClickListener{
            finish()
        }
        btnNext4.setOnClickListener{
            val intent = Intent (this,FourthBirdActivity::class.java)
            startActivity(intent)
        }

    }
}