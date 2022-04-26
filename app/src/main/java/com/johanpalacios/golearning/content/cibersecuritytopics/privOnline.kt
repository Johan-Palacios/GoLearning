package com.johanpalacios.golearning.content.cibersecuritytopics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView
import com.johanpalacios.golearning.R

class privOnline : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_priv_online)
        var pdf = findViewById<PDFView>(R.id.pdfViewDataOnline)
        pdf.fromAsset("PROTECT_DIGITAL_DATA.pdf").load()
    }
}