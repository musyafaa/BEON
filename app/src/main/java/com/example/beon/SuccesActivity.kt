package com.example.beon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.beon.databinding.ActivitySuccesBinding
import com.example.beon.databinding.ActivityVerificationBinding

class SuccesActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySuccesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuccesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            startActivity(Intent(this, PasswordActivity::class.java))
        }
        binding.btnBack.setOnClickListener {
            startActivity(Intent(this, sign_in::class.java))
        }
    }
}