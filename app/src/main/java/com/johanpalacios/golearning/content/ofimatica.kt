package com.johanpalacios.golearning.content

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import com.johanpalacios.golearning.R

class ofimatica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ofimatica)
        val microsoftOffice = findViewById<CardView>(R.id.office365)
        val googleDrive = findViewById<CardView>(R.id.googleDrive)
        val iCloud = findViewById<CardView>(R.id.appleCloud)
        val dropbox = findViewById<CardView>(R.id.dropbox)
        val libreOffice = findViewById<CardView>(R.id.libreOffice)
        val word = findViewById<CardView>(R.id.word_video)
        val powerPoint = findViewById<CardView>(R.id.power_video)
        val exel = findViewById<CardView>(R.id.excel_video)
        microsoftOffice.setOnClickListener(View.OnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, convertUrl("https://youtu.be/bsspDMRvgz0")))
        })
        word.setOnClickListener(View.OnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, convertUrl("https://youtu.be/n0yn3TZ1lSQ")))
        })
        powerPoint.setOnClickListener(View.OnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, convertUrl("https://youtu.be/ra0hKJv8zbw")))
        })
        exel.setOnClickListener(View.OnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, convertUrl("https://youtu.be/v_R5SaMTlug")))
        })
        googleDrive.setOnClickListener(View.OnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, convertUrl("https://youtu.be/qE8yX0ovkq8")))
        })
        iCloud.setOnClickListener(View.OnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, convertUrl("https://youtu.be/-Qn_wTF_8ps")))
        })
        dropbox.setOnClickListener(View.OnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, convertUrl("https://youtu.be/90phZlSceSY")))
        })
        libreOffice.setOnClickListener(View.OnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, convertUrl("https://youtu.be/nJhsuzTfTuM")))
        })
    }

    fun convertUrl(url: String): Uri? {
        val uri = Uri.parse(url)
        return uri
    }
}