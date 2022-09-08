package com.lizven.ui.fragment.general

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.lizven.R
import com.lizven.databinding.FragmentMnuPrincipalBinding


class MnuPrincipal : Fragment(R.layout.fragment_mnu_principal) {

    private lateinit var binding : FragmentMnuPrincipalBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMnuPrincipalBinding.bind(view)

        binding.btnAlmacen.setOnClickListener{
            findNavController().navigate(R.id.action_mnuPrincipal_to_almacenMenu)
        }
    }

}