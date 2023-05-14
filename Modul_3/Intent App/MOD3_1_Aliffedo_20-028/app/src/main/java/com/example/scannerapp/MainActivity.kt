package com.example.scannerapp

import android.app.Activity
import android.content.ActivityNotFoundException
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
            val intent = packageManager.getLaunchIntentForPackage("com.google.ar.lens")
            if (intent != null) {
                intent.action = Intent.ACTION_MAIN
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