package com.johanpalacios.golearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.johanpalacios.golearning.content.*

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val goSoftware = findViewById<CardView>(R.id.software)
        val goOfimatica = findViewById<CardView>(R.id.ofimatica)
        val goCiber = findViewById<CardView>(R.id.cibersecurity)
        val goBasicPC = findViewById<CardView>(R.id.basicPC)
        val goWeb = findViewById<CardView>(R.id.web)
        goBasicPC.setOnClickListener {
            val intent = Intent(this, componetsPC::class.java)
            startActivity(intent)
        }
        goSoftware.setOnClickListener {
            val intent = Intent(this, software::class.java)
            startActivity(intent)
        }
        goWeb.setOnClickListener {
            val intent = Intent(this, web::class.java)
            startActivity(intent)
        }
        goOfimatica.setOnClickListener{
            val intent  = Intent(this, ofimatica::class.java)
            startActivity(intent)
        }
        goCiber.setOnClickListener {
            val intent = Intent(this, cibersecurity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
    }
}