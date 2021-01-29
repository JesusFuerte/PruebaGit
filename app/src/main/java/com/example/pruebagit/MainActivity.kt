package com.example.pruebagit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun salto (view: View) {
        val saltar = Intent(this, SegundaActivity::class.java)
        this.startActivity(saltar)
    }
}