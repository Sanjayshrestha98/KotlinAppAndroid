package com.sanjay.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class AlertActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert)

        val button : Button = findViewById(R.id.button)

        button.setOnClickListener {

            val builder = AlertDialog.Builder(this)
                builder.setTitle("My Alert")

                builder.setMessage("Are You Sure ?")
            builder.setIcon(android.R.drawable.ic_dialog_alert)

            builder.setPositiveButton("Yes"){dialogInterface, which ->
                Toast.makeText(applicationContext,"Clicked Yes",Toast.LENGTH_LONG).show()
            }

            builder.setNeutralButton("Cancel"){dialogInterface, which ->
                Toast.makeText(applicationContext,"Clicked cancel\n operation cancel",Toast.LENGTH_LONG).show()
            }

            builder.setNegativeButton("No"){dialogInterface, which ->
                Toast.makeText(applicationContext,"Click No", Toast.LENGTH_LONG).show()
            }

            val alertDialog : AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()


        }

    }
}