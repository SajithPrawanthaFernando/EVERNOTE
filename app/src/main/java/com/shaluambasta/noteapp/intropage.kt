package com.shaluambasta.noteapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class intropage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intro_page) // Replace "intro_page" with the actual name of your XML layout file

        val button = findViewById<Button>(R.id.button) // If not using ViewBinding
        // Or if using ViewBinding:
        // val button = binding.button

        button.setOnClickListener {
            val intent = Intent(this@intropage, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
