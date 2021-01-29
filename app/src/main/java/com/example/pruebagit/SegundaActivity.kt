package com.example.pruebagit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class SegundaActivity : AppCompatActivity() {
    var secondTextLabel: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)
        secondTextLabel = findViewById(R.id.second_text_label)
        secondTextLabel?.text = getText(R.string.wellcome_to_heaven)
        secondTextLabel?.setOnClickListener{
            Toast.makeText(this, getString(R.string.wellcome_to_earth), Toast.LENGTH_LONG)
                .show()
        }
    }
}