package com.example.gittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("creating conflict 1 master")
        println("change 2")
        println("creating conflict 1")
        println("from friend push")


    }
}