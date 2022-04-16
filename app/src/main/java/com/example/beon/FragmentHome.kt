package com.example.beon

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.beon.databinding.FragmentHomeBinding

class FragmentHome : Fragment() {

    private val binding : FragmentHomeBinding by lazy {
        FragmentHomeBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding.imgFilter.setOnClickListener {
            startActivity(Intent(requireContext(), FilterActivity::class.java))
        }
        binding.tvView.setOnClickListener {
            startActivity(Intent(requireContext(), FindActivity::class.java))
        }
        return binding.root



    }


}
