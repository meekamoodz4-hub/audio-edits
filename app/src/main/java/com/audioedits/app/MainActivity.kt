package com.audioedits.app

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val titleText = findViewById<TextView>(R.id.titleText)
        val editButton = findViewById<Button>(R.id.editButton)

        titleText.text = "Audio Edits"

        editButton.setOnClickListener {
            titleText.text = "Audio Edits is ready!"
        }
    }
}
