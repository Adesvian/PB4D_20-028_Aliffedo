package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        val firstFragment =  FirstFragment()
        val fragment = fragmentManager.findFragmentByTag(FirstFragment::class.java.simpleName)
        if(fragment !is FirstFragment){
            fragmentManager
                .beginTransaction()
                .add(R.id.frame_container, firstFragment, FirstFragment::class.java.simpleName)
                .commit()

        }

    }

}