package com.example.beon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.beon.databinding.ActivityVcBinding

class VcActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVcBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVcBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.decline.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}