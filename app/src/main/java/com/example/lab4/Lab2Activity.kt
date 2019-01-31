package com.example.lab4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Lab2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab2)

        val lab2WebView = findViewById<WebView>(R.id.lab2WebView)
        lab2WebView.loadUrl("https://github.com/Andy5am/PMLab2")
    }
}
