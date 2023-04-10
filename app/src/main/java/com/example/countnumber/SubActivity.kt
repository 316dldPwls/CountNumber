package com.example.countnumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
    }

    override fun onDestroy() {
        super.onDestroy()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}