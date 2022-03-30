package com.johanpalacios.golearning.content

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.nfc.cardemulation.CardEmulation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.*
import androidx.cardview.widget.CardView
import com.johanpalacios.golearning.R

class software : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_software)
        val goYTlinux = findViewById<CardView>(R.id.linuxYT)
        val goYTSoftware = findViewById<CardView>(R.id.software)
        val goYTSoftwareOfApp = findViewById<CardView>(R.id.softwareDeApp)
        val goYTSoftwareOfProgramming = findViewById<CardView>(R.id.softwareDeProgramacion)
        goYTlinux.setOnClickListener(View.OnClickListener {
            goToUrl("https://youtu.be/UUJ0dFpj1-M")
        })
        goYTSoftware.setOnClickListener(View.OnClickListener {
            goToUrl("https://youtu.be/vB0BjbMM3k4")
        })
        goYTSoftwareOfApp.setOnClickListener(View.OnClickListener {
            goToUrl("https://youtu.be/NXKqrW2AAJY")
        })
        goYTSoftwareOfProgramming.setOnClickListener(View.OnClickListener {
            goToUrl("https://youtu.be/dx_sfmbV-bo")
        })
    }

    private fun goToUrl(url: String) {
        val uri = Uri.parse(url)
        startActivity(Intent(Intent.ACTION_VIEW, uri))
    }

}