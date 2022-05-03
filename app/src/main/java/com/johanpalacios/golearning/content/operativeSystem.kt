package com.johanpalacios.golearning.content

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import com.johanpalacios.golearning.R
import com.johanpalacios.golearning.content.operativeSystemGL.freeSoftware

class operativeSystem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operative_system)
        val goFreeSoftware = findViewById<CardView>(R.id.freeSoftware)
        val goInstallOS = findViewById<CardView>(R.id.instalationOS)
        val goComandsLinux = findViewById<CardView>(R.id.comandosBásicosLinux)
        goFreeSoftware.setOnClickListener {
            val intent = Intent(this, freeSoftware::class.java)
            startActivity(intent)
        }
        goInstallOS.setOnClickListener(View.OnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, convertUrl("https://youtu.be/vbcdnq3zgdc")))
        })
        goComandsLinux.setOnClickListener(View.OnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, convertUrl("https://youtu.be/etc85nZU7e4")))
        })
    }
    private fun convertUrl(url: String): Uri? {
        return Uri.parse(url)
    }
}