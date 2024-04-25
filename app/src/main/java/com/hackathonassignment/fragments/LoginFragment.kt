package com.hackathonassignment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hackathonassignment.R
import com.hackathonassignment.databinding.LoginFragmentBinding


class LoginFragment : Fragment() {

    private lateinit var binding: LoginFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = LoginFragmentBinding.inflate(inflater,container,false)

        initListner()

        return binding.root
    }

    private fun initListner (){

        binding.txtCreateAnAccount.setOnClickListener {
            addCreateAnAccount()
        }

        binding.btnLogin.setOnClickListener {
            addHomeScreen()
        }
    }
    private fun addCreateAnAccount() {

        val createAnAccountFragment = AccountFragement()

        parentFragmentManager.beginTransaction()
            .add(R.id.mainContainer, createAnAccountFragment)
            .addToBackStack(null)
            .commit()
    }

    private fun addHomeScreen(){

        val homeScreenFragment = HomeScreenFragment()

        parentFragmentManager.beginTransaction()
            .add(R.id.mainContainer,homeScreenFragment)
            .addToBackStack(null)
            .commit()
    }
}