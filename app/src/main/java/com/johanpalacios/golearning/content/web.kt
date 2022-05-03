package com.johanpalacios.golearning.content

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.johanpalacios.golearning.R
import com.johanpalacios.golearning.content.webtopic.historyweb

class web : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        val goHistoryWeb = findViewById<CardView>(R.id.history_web)
        goHistoryWeb.setOnClickListener{
            val intent = Intent(this, historyweb::class.java)
            startActivity(intent)
        }
    }
}