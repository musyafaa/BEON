package com.example.beon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.beon.databinding.ActivitySignupBinding

class signup : AppCompatActivity() {

    private lateinit var binding : ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.appCompatButton.setOnClickListener {
            startActivity(Intent(this, signup_proses::class.java))
        }
        binding.tvAlready.setOnClickListener {
            startActivity(Intent(this, sign_in::class.java))
        }

    }
}