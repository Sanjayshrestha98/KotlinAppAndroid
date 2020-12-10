package com.sanjay.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class AutoComplete : AppCompatActivity() {

    private val languages = arrayOf("Nepali","English","Chinese","Hindi")
    private lateinit var autoComplete: AutoCompleteTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_complete)

        autoComplete = findViewById(R.id.autocomplete)

        val autoCompleteAdapter = ArrayAdapter(
            applicationContext,android.R.layout.simple_dropdown_item_1line,languages
        )
        autoComplete.setAdapter(autoCompleteAdapter)
        autoComplete.threshold = 1

    }
}