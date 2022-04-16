package com.example.beon

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.beon.databinding.FragmentChatBinding
import com.example.beon.databinding.FragmentHomeBinding

class FragmentChat : Fragment() {

    private val binding : FragmentChatBinding by lazy {
        FragmentChatBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding.vc.setOnClickListener {
            startActivity(Intent(requireContext(), VcActivity::class.java))
        }

        return binding.root



    }


}
