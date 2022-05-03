package com.johanpalacios.golearning.content

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.johanpalacios.golearning.R
import com.johanpalacios.golearning.content.network.components_network
import com.johanpalacios.golearning.content.network.createBasicNetwork

class networks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_networks)
        val goComponets = findViewById<CardView>(R.id.network_components)
        val goMakeNetwork = findViewById<CardView>(R.id.basicNetwork)
        goComponets.setOnClickListener {
            val intent = Intent(this, components_network::class.java)
            startActivity(intent)
        }
        goMakeNetwork.setOnClickListener {
            val intent = Intent(this, createBasicNetwork::class.java)
            startActivity(intent)
        }
    }
}