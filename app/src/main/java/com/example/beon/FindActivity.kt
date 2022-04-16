package com.example.beon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.beon.databinding.ActivityFindBinding
import com.example.beon.databinding.FragmentHomeBinding

class FindActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFindBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFindBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.kembali.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        binding.imageView2.setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }
    }
}