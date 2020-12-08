package com.sanjay.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_image.*

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        var rajeshdai: RadioButton = findViewById(R.id.rajeshdai)
        var rajendra: RadioButton = findViewById(R.id.rajendra)
        var mundre: RadioButton = findViewById(R.id.mundre)

        rajendra.setOnClickListener {
            imgProfile.setImageResource(R.drawable.rajendrakhadgi)
        }
        rajeshdai.setOnClickListener {
            imgProfile.setImageResource(R.drawable.rajeshdai)
        }
        mundre.setOnClickListener {
            imgProfile.setImageResource(R.drawable.mundre)
        }
    }
}