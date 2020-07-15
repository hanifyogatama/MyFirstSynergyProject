package com.binar.myfirstsynergy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// Kotlin Synthetic -------------------------------
        btnKotlinSynthetic.setOnClickListener{
            Log.d("Binar","Tombol login di klik")
        }


        // find by id -------------------------------

        // cara 1
//      val btnFindIdMessage : Button = findViewById(R.id.btnFindById)
//      btnFindIdMessage.text = "hi, i'm clicked"

        // cara 2
        var outputFindViewId: TextView? = null
        var myButton: Button ?= null

        outputFindViewId = findViewById(R.id.tvHelloSynergy)
        myButton= findViewById(R.id.btnFindById)
        myButton?.setOnClickListener {
            outputFindViewId?.text = getString(R.string.click_me)
        }
    }
}

