package com.example.beon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.beon.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.back.setOnClickListener {
            startActivity(Intent(this, FindActivity::class.java))
        }
        binding.btnCon.setOnClickListener {
            startActivity(Intent(this, VcActivity::class.java))
        }
        binding.btnSer.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}