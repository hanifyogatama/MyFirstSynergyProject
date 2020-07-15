package com.binar.myfirstsynergy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
// import kotlinx.android.synthetic.main.activity_main.*
import com.binar.myfirstsynergy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)

        // VIEW BINDING --------------------------------------------------------

//        val binding =ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        binding.btnViewBinding.setOnClickListener(){
//            intent= Intent(applicationContext,MainActivity2::class.java)
//            startActivity(intent)
//        }


// DATA BINDING ----------------------------------------------------------------
        lateinit var binding : ActivityMainBinding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.btnDataBinding.setOnClickListener{
            val nama = binding.etKetik.text.toString()
            if(nama == null || nama.trim() == "")
                Toast.makeText(this@MainActivity, "input tidak boleh kosong", Toast.LENGTH_SHORT).show()
            else {
                binding.tvName.setText(nama)
                // change image
                val imgRes = resources.getIdentifier(nama, "drawable",packageName)
                binding.imgBinar.setImageResource(imgRes)
            }
        }


// KOTLIN SYNTHETIC -------------------------------------------------
//        btnKotlinSynthetic.setOnClickListener{
//            Log.d("Binar","Tombol login di klik")
//        }


//        FIND VIEW BY ID -----------------------------------------------
        var outputFindViewId: TextView? = null
        var myButton: Button ?= null

        outputFindViewId = findViewById(R.id.tvHelloSynergy)
        myButton= findViewById(R.id.btnFindById)
        myButton?.setOnClickListener {
            outputFindViewId?.text = getString(R.string.click_me)
        }
    }
}

