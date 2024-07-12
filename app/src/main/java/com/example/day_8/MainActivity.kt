package com.example.day_8

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var btn : Button? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btn = findViewById(R.id.btnsaveclick)
        btn?.setOnClickListener{
            Toast.makeText(this,"Item is saved " , Toast.LENGTH_SHORT).show()
        }

        btn = findViewById(R.id.btncancleclick)
        btn?.setOnClickListener{
            Toast.makeText(this,"item is cancled " , Toast.LENGTH_SHORT).show()
        }



    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"On start", Toast.LENGTH_SHORT).show()

    }
    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"On resume", Toast.LENGTH_SHORT).show()

    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"On Stop", Toast.LENGTH_SHORT).show()

    }
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"On Restart", Toast.LENGTH_SHORT).show()

    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"On Destroy", Toast.LENGTH_SHORT).show()

    }


}