package com.example.beon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.beon.databinding.ActivitySignupProsesBinding

class signup_proses : AppCompatActivity() {

    private lateinit var binding: ActivitySignupProsesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupProsesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgBack.setOnClickListener {
            startActivity(Intent(this, signup::class.java))
        }
        binding.btnNext.setOnClickListener {
            startActivity(Intent(this, signup_notif::class.java))
        }
    }
}