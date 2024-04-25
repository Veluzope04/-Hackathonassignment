package com.hackathonassignment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hackathonassignment.databinding.BookinghistoryBinding

class BookingHistoryFragment : Fragment() {

    private lateinit var binding: BookinghistoryBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = BookinghistoryBinding.inflate(inflater,container,false)

        initListner()
        return binding.root
    }
     private fun initListner(){
         binding.imgArrow.setOnClickListener {
             parentFragmentManager.popBackStack()
         }
     }
}