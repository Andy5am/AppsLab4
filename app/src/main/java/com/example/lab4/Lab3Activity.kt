package com.example.lab4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Lab3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab3)

        val lab3WebView = findViewById<WebView>(R.id.lab3WebView)
        lab3WebView.loadUrl("https://github.com/Andy5am/Plataformas")
    }
}
