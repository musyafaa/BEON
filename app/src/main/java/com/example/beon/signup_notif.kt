package com.example.beon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.beon.databinding.ActivitySignupNotifBinding

class signup_notif : AppCompatActivity() {

    private lateinit var binding : ActivitySignupNotifBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupNotifBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTrynow.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}