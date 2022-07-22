package com.lizven.ui.general

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.lizven.R
import com.lizven.databinding.FragmentLoginBinding


class Login : Fragment(R.layout.fragment_login) {

    private lateinit var fragmentLoginBinding: FragmentLoginBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentLoginBinding.bind(view)
        fragmentLoginBinding = binding

        binding.passw.text?.trim()


    }


}