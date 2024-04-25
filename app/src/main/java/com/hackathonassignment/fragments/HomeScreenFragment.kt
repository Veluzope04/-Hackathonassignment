package com.hackathonassignment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hackathonassignment.R
import com.hackathonassignment.databinding.HomeScreenFragmentBinding

class HomeScreenFragment : Fragment() {

    private lateinit var binding: HomeScreenFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = HomeScreenFragmentBinding.inflate(inflater,container,false)


        initListener()
        return binding.root

    }

    private fun initListener() {
        binding.btnBookingHistory.setOnClickListener {
            addBookingFragment()
        }
        }

    private fun addBookingFragment(){

        val bookingHistoryFragment = BookingHistoryFragment()

        parentFragmentManager.beginTransaction()
            .add(R.id.mainContainer, bookingHistoryFragment)
            .addToBackStack(null)
            .commit()
    }
}