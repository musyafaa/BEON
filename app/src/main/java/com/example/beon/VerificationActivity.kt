package com.example.beon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.beon.databinding.ActivityVerificationBinding

class VerificationActivity : AppCompatActivity() {

    private lateinit var binding : ActivityVerificationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityVerificationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgBtnBack.setOnClickListener {
            startActivity(Intent(this, ForgotActivity::class.java))
        }
        binding.btnNext.setOnClickListener {
            startActivity(Intent(this, PasswordActivity::class.java))
        }
    }
}