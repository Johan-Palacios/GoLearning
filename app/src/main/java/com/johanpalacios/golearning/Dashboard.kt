package com.johanpalacios.golearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
    }

    override fun onBackPressed() {
    }
}