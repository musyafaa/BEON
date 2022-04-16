package com.example.beon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.beon.databinding.ActivityFilterBinding
import com.example.beon.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.activity_filter.*

class FilterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFilterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        binding.btnShow.setOnClickListener {
            startActivity(Intent(this, FindActivity::class.java))
        }
    }
}