package com.sanjay.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var etFirst: EditText
    private lateinit var etSecond: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etFirst = findViewById(R.id.etFirst)
        etSecond = findViewById(R.id.etSecond)
        btnCalculate = findViewById(R.id.btnCalculate)
        tvResult = findViewById(R.id.tvResult)

        btnCalculate.setOnClickListener{

            if(validate()){
                retrievevalues();
        }
        }
    }

    private fun retrievevalues(){
        val first:Int = etFirst.text.toString().toInt()
        val second:Int = etSecond.text.toString().toInt()
        addAnother(first,second)
    }

    private fun addAnother(first: Int, second: Int) {
        val result = first + second
        tvResult.text = result.toString()
    }

    private fun validate():Boolean{
        var flag = true
        if(TextUtils.isEmpty(etFirst.text)){
            etFirst.error = "Please Enter First number"
            etFirst.requestFocus()
            flag = false
        }
        else if (TextUtils.isEmpty(etSecond.text)){
            etSecond.error = "Please Enter Second Number"
            etSecond.requestFocus()
            flag = false
        }
        return flag
    }

}