package com.lizven.ui.fragment.Almacen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.lizven.R
import com.lizven.databinding.FragmentAlmacenMenuBinding


class almacenMenu : Fragment(R.layout.fragment_almacen_menu) {

    lateinit var binding: FragmentAlmacenMenuBinding



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAlmacenMenuBinding.bind(view)

        binding.btnMatDirecto.setOnClickListener{
            findNavController().navigate(R.id.action_almacenMenu_to_registroMateriales)
        }

    }

}