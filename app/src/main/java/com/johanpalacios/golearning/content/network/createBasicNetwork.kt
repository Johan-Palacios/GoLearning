package com.johanpalacios.golearning.content.network

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import com.johanpalacios.golearning.R

class createBasicNetwork : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_basic_network)
        val goIp = findViewById<CardView>(R.id.ip_video)
        val goPacketTracer = findViewById<CardView>(R.id.packet_video)
        val goBasicNetwork = findViewById<CardView>(R.id.red_video)
        goIp.setOnClickListener(View.OnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, convertUrl("https://youtu.be/UYfJPB3crGc")))
        })
        goPacketTracer.setOnClickListener(View.OnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, convertUrl("https://youtu.be/wcYBCuCA4-o")))
        })
        goBasicNetwork.setOnClickListener(View.OnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, convertUrl("https://youtu.be/P0Now9Eg-rM")))
        })
    }
    private fun convertUrl(url: String): Uri? {
        return Uri.parse(url)
    }
}