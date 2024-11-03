package com.example.chartph

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)  // Reference layout directly using R.layout

        val signInButton = findViewById<Button>(R.id.sign_in_button)  // Reference ID directly using R.id
        signInButton.setOnClickListener {
            val intent = Intent(this, OTPVerificationActivity::class.java)
            startActivity(intent)
        }
    }
}
