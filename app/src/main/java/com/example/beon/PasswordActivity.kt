package com.example.beon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.beon.databinding.ActivityPasswordBinding

class PasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgBtnBack.setOnClickListener {
            startActivity(Intent(this, VerificationActivity::class.java))
        }
        binding.btnNext.setOnClickListener {
            startActivity(Intent(this, SuccesActivity::class.java))
        }
    }
}