package com.johanpalacios.golearning.content

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.johanpalacios.golearning.R
import com.johanpalacios.golearning.content.cibersecuritytopics.*

class cibersecurity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cibersecurity)
        val data= findViewById<CardView>(R.id.data)
        val dataorg= findViewById<CardView>(R.id.dataorg)
        val profciber= findViewById<CardView>(R.id.profesionalciber)
        val ciberWar= findViewById<CardView>(R.id.ciberwar)
        val analize = findViewById<CardView>(R.id.anlzciber)
        val panoCiber = findViewById<CardView>(R.id.pano_Ciber)
        val protectData = findViewById<CardView>(R.id.protect_data)
        val privDataOnline = findViewById<CardView>(R.id.priv_online)
        data.setOnClickListener {
            val intent = Intent(this, com.johanpalacios.golearning.content.cibersecuritytopics.data::class.java)
            startActivity(intent)
        }
        dataorg.setOnClickListener {
            val intent = Intent(this, com.johanpalacios.golearning.content.cibersecuritytopics.dataorg::class.java)
            startActivity(intent)
        }
        profciber.setOnClickListener {
            val intent = Intent(this,profesionalciber::class.java)
            startActivity(intent)
        }
        ciberWar.setOnClickListener {
            val intent = Intent(this, ciberwar::class.java)
            startActivity(intent)
        }
        analize.setOnClickListener {
            val intent = Intent(this,analizeciber::class.java)
            startActivity(intent)
        }
        panoCiber.setOnClickListener {
            val intent = Intent(this,PanoramicCiber::class.java)
            startActivity(intent)
        }
        protectData.setOnClickListener {
            val intent = Intent(this, com.johanpalacios.golearning.content.cibersecuritytopics.protectData::class.java)
            startActivity(intent)
        }
        privDataOnline.setOnClickListener {
            val intent = Intent(this, privOnline::class.java)
            startActivity(intent)
        }
    }
}