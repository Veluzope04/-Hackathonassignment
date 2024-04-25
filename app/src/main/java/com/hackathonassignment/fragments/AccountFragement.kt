package com.hackathonassignment.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hackathonassignment.R
import com.hackathonassignment.databinding.CreateAccountFragmentBinding

class AccountFragement : Fragment (){

    private lateinit var binding: CreateAccountFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = CreateAccountFragmentBinding.inflate(inflater,container,false)

        initListner()

        return binding.root

    }

    private fun initListner() {

        binding.txtLogin.setOnClickListener {
            addLoginFragment()

        }
    }
            private fun addLoginFragment() {

                val loginFragment = LoginFragment()

                parentFragmentManager.beginTransaction()
                    .add(R.id.mainContainer, loginFragment)
                    .addToBackStack(null)
                    .commit()
            }

    }
