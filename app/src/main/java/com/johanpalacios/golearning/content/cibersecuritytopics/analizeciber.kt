package com.johanpalacios.golearning.content.cibersecuritytopics

import android.content.Intent
import android.graphics.pdf.PdfRenderer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.DocumentsContract
import com.github.barteksc.pdfviewer.PDFView
import com.johanpalacios.golearning.R

class analizeciber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_analizeciber)
        var pdf = findViewById<PDFView>(R.id.pdfView)
        pdf.fromAsset("ANÁLISIS DE UN CIBERATAQUE.pdf").load()
    }
}