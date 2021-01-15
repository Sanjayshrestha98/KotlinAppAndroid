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

        etjoindate.setOnFocusChangeListener { v, hasFocus ->
            if(hasFocus)loadCalenderforjoin()

        }


        etdob.setOnFocusChangeListener { v, hasFocus ->
            if(hasFocus)loadCalenderforage()  }
    }

    private fun loadCalenderforjoin(){

        val datePickerDialog = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener{
                    view,yearNew, monthOfYear, dayOfMonth ->
                etjoindate.setText("Selected Date : $dayOfMonth/$monthOfYear/$yearNew")

                if(month-monthOfYear < 0  ){
                    var mth = (month - monthOfYear) + 12
                    var yer = (year - yearNew) - 1
                    etyearsworked.setText("You have worked for ${yer} year and ${mth} months")
                }
                else
                etyearsworked.setText("You have worked for ${year - yearNew} years and ${month-monthOfYear} months")
            },
            year, month, day
        )
        datePickerDialog.show()
        etjoindate.clearFocus()
    }

    private fun loadCalenderforage(){
        val datePickerDialog = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener{
                    view,yearNew, monthOfYear, dayOfMonth ->
                etdob.setText("Selected Date : $dayOfMonth/${monthOfYear+1}/$yearNew")

                if(month-monthOfYear < 0  ){
                    var mth = (month - monthOfYear) + 12

                    var yer = (year - yearNew) - 1
                    etyourage.setText("You are $yer Years and $mth months old")
                }
                else
                etyourage.setText("You are ${year - yearNew} Years and ${month-monthOfYear} months old")

            },
            year, month, day
        )
        datePickerDialog.show()
        etdob.clearFocus()
    }

}