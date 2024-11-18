package com.example.week1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RadioActivity : AppCompatActivity() {
    lateinit var nike : RadioButton
    lateinit var adidas : RadioButton
    lateinit var erke : RadioButton
    lateinit var image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radio)
        nike = findViewById(R.id.radioNike)
        adidas = findViewById(R.id.radioAdidas)
        erke = findViewById(R.id.radioErke)
        image = findViewById(R.id.imageView)

        nike.setOnClickListener{
            image.setImageResource(R.drawable.nike)
        }
        adidas.setOnlickListener{
            image.setImageResource(R.drawable.adidas)
        }
        erke.setOnlickListener{
            image.setImageResource(R.drawable.erke)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}