package com.johanpalacios.golearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.johanpalacios.golearning.content.software

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val goSoftware = findViewById<CardView>(R.id.software)
        goSoftware.setOnClickListener {
            val intent = Intent(this, software::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
    }
}