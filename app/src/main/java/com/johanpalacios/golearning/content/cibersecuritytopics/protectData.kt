package com.johanpalacios.golearning.content.cibersecuritytopics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView
import com.johanpalacios.golearning.R

class protectData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_protect_data)
        var pdf = findViewById<PDFView>(R.id.pdfViewData)
        pdf.fromAsset("PROTECT_DATA.pdf").load()
    }
}