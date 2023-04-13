package com.example.scannerapp

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<ImageButton>(R.id.imageButton)
        val btn2 = findViewById<ImageButton>(R.id.imageButton2)

        btn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("http://www.google.com")
                setPackage("com.google.ar.lens")
            }
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(this, "Aplikasi Google Lens tidak terpasang di perangkat ini", Toast.LENGTH_SHORT).show()
            }
        }

        btn2.setOnClickListener{
            Intent(this, DetailActivity::class.java).also{
                startActivity(it)
            }
        }
    }

}