package com.example.day_8

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Maan2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
//        var btn:Button? = null
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_maan2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        btn = findViewById(R.id.math)
//        btn?.setOnClickListener{
//         Toast.makeText(this,"on start",Toast.LENGTH_SHORT).show()
//
//        }

    }
}