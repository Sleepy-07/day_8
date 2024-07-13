package com.example.day_8

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var btn : Button? = null
    var editText: EditText? = null
    var editText2: EditText? = null
    var editText3: EditText? = null
    var editText4: EditText? = null
    var editText5: EditText? = null
    var editText6: EditText? = null

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
        editText = findViewById(R.id.etname)
        editText2 = findViewById(R.id.etemail)
        editText3 = findViewById(R.id.etpsd)
        editText4 = findViewById(R.id.etConfirmpsd)
        editText5 = findViewById(R.id.etaddress)
        editText6 = findViewById(R.id.etcontact)
        btn?.setOnClickListener{


            if(editText?.text.toString().isNullOrEmpty() || editText2?.text.toString().isNullOrEmpty() || editText3?.text.toString().isNullOrEmpty() || editText4?.text.toString().isNullOrEmpty() || editText5?.text.toString().isNullOrEmpty() || editText6?.text.toString().isNullOrEmpty()){
                Toast.makeText(this,"Must enter full deatils ",Toast.LENGTH_SHORT).show()
                if(editText?.text.toString().isNullOrEmpty()){
                    editText?.error="Enter the name"
                }
                else if(editText2?.text.toString().isNullOrEmpty()){
                    editText2?.error="Enter the email"
                }
                else if(editText6?.text.toString().isNullOrEmpty()){
                    editText6?.error="Enter the contact"
                }

                else if(editText5?.text.toString().isNullOrEmpty()){
                    editText5?.error="Enter the Adress"
                }
                else if(editText3?.text.toString().isNullOrEmpty()){
                    editText3?.error="Enter the password"
                }
                else {
                    editText4?.error="Enter your Confirm Password"
                }

            }
            else if(editText4?.text.toString() != editText3?.text.toString()){
                Toast.makeText(this,"Password doesn't Match",Toast.LENGTH_SHORT).show()
            }
            else{
            val intent = Intent(this,LinearActivity2::class.java)
            startActivity(intent)
//            Toast.makeText(this,"Item is saved " , Toast.LENGTH_SHORT).show()
        }
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