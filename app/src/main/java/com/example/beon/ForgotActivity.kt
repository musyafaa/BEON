package com.example.beon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.beon.databinding.ActivityForgotBinding

class ForgotActivity : AppCompatActivity() {

   private lateinit var binding: ActivityForgotBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgbtnBack.setOnClickListener {
            startActivity(Intent(this, sign_in::class.java))
        }
        binding.btnNext.setOnClickListener {
            startActivity(Intent(this, VerificationActivity::class.java))
        }
    }
}