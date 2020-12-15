package com.sanjay.kotlinapp

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import java.util.*

class CalendartaskActivity : AppCompatActivity() {

private lateinit var etjoindate : EditText
private lateinit var etdob : EditText
private lateinit var etyearsworked : EditText
private lateinit var etyourage : EditText
private lateinit var tvDate : TextView
    val c = Calendar.getInstance()
    val year = c.get(Calendar.YEAR)
    val month = c.get(Calendar.MONTH)
    val day = c.get(Calendar.DAY_OF_MONTH)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendartask)

        etjoindate = findViewById(R.id.etjoindate)
        etdob = findViewById(R.id.etdob)
        etyearsworked = findViewById(R.id.etyearsworked)
        etyourage = findViewById(R.id.etyourage)
        tvDate = findViewById(R.id.tvDate)

        etjoindate.setOnClickListener {
            loadCalenderforjoin()
        }
        etdob.setOnClickListener {
            loadCalenderforage()
        }

    }

    private fun loadCalenderforjoin(){

        val datePickerDialog = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener{
                    view,yearNew, monthOfYear, dayOfMonth ->
                etjoindate.setText("Selected Date : $dayOfMonth/${monthOfYear+1}/$year")
                etyearsworked.setText("${year - yearNew} Years, ${month - monthOfYear} months")
            },
            year, month, day
        )
        datePickerDialog.show()
    }

    private fun loadCalenderforage(){
        val datePickerDialog = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener{
                    view,yearNew, monthOfYear, dayOfMonth ->
                etdob.setText("Selected Date : $dayOfMonth/${monthOfYear+1}/$year")
                etyourage.setText("${year - yearNew}")
            },
            year-10, month, day
        )
        datePickerDialog.show()
    }

}