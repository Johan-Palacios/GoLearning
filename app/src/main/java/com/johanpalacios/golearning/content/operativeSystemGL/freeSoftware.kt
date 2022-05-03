package com.johanpalacios.golearning.content.operativeSystemGL

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView
import com.johanpalacios.golearning.R

class freeSoftware : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_free_software)
        val pdf = findViewById<PDFView>(R.id.pdfView)
        pdf.fromAsset("CUADRO SINOPTICO SOFTWARE LIBRE.pdf").load()
    }
}