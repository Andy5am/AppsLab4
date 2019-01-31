package com.example.lab4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProjectsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projects)

        val lab2Button = findViewById<Button>(R.id.lab2Button)
        lab2Button.setOnClickListener {
            val intent = Intent(this,Lab2Activity::class.java)
            startActivity(intent)
        }

        val lab3Button = findViewById<Button>(R.id.lab3Button)
        lab3Button.setOnClickListener {
            val intent = Intent(this,Lab3Activity::class.java)
            startActivity(intent)
        }

    }
}
