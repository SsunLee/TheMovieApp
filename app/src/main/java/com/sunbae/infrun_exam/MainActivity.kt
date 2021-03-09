package com.sunbae.infrun_exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnTest = findViewById<Button>(R.id.Button1)

        btnTest.setOnClickListener {
            val text = "환영 합니다. "
            val duration = Toast.LENGTH_SHORT
            val t = Toast.makeText(applicationContext, text, duration)
            t.show()
        }

    }
}