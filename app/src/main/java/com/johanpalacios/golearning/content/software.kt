package com.johanpalacios.golearning.content

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
           startActivity(Intent(Intent.ACTION_VIEW,convertUrl("https://youtu.be/UUJ0dFpj1-M")))
        })
        goYTSoftware.setOnClickListener(View.OnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW,convertUrl("https://youtu.be/vB0BjbMM3k4")))
        })
        goYTSoftwareOfApp.setOnClickListener(View.OnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, convertUrl("https://youtu.be/NXKqrW2AAJY")))
        })
        goYTSoftwareOfProgramming.setOnClickListener(View.OnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, convertUrl("https://youtu.be/dx_sfmbV-bo")))
        })
    }

    fun convertUrl(url: String): Uri? {
        val uri = Uri.parse(url)
        return uri
    }
}

