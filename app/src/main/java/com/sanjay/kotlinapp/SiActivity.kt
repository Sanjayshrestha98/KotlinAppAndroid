package com.sanjay.kotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.sanjay.kotlinapp.databinding.ActivityMainBinding
import com.sanjay.kotlinapp.databinding.ActivitySiBinding

class SiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivitySiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSi.setOnClickListener{
          val principal = binding.principle.text.toString().toFloat()
          val rate = binding.rate.text.toString().toFloat()
          val time = binding.years.text.toString().toFloat()
          val result = (principal*rate*time)/100
            Toast.makeText(this, "SI is $result", Toast.LENGTH_LONG).show()
            startActivity(Intent(this,MainActivity::class.java)
            )
        }
    }
}