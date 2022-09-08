package com.lizven.ui.fragment.general

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.lizven.R
import com.lizven.core.Resource
import com.lizven.data.remote.loginFirebase.LoginDatasource
import com.lizven.databinding.FragmentLoginBinding
import com.lizven.repository.login.LoginRepoImplenent
import com.lizven.ui.presentation.LoginViewModel
import com.lizven.ui.presentation.LoginViewModelFactory


class Login : Fragment(R.layout.fragment_login) {

    private lateinit var binding: FragmentLoginBinding
    private val firebaseAuth by lazy { FirebaseAuth.getInstance()}
    private val viewModel by viewModels<LoginViewModel> { LoginViewModelFactory(LoginRepoImplenent(
        LoginDatasource()
    )) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLoginBinding.bind(view)
        binding.progressBarlogin.visibility= View.GONE
        isUsserLogIn() // comprueba si esta logeado
        doLogin()


    }
    private fun isUsserLogIn(){
        firebaseAuth.currentUser?.let {
            findNavController().navigate(R.id.action_login_to_mnuPrincipal) }
    }

    private fun doLogin(){
      binding.login.setOnClickListener{
          val email = binding.passw.text.toString().trim()
          val password = binding.paswordText.text.toString().trim()
          validateCredential(email,password)//validaciones
          signIn(email,password)

      }
    }

    private  fun validateCredential(email:String ,password:String){

        if (email.isEmpty()){
           Toast.makeText(context,"Email vacio ",Toast.LENGTH_SHORT).show()

            return
        }
        if (password.isEmpty()){
            Toast.makeText(context,"ingrese una contraseña valida",Toast.LENGTH_SHORT).show()

            return
        }
    }
    private fun signIn (email:String,password:String){
        viewModel.signIn(email,password).observe(viewLifecycleOwner, Observer{result->
            when(result){
              is Resource.Loading -> {
                  binding.progressBarlogin.visibility = View.VISIBLE
                    binding.login.isEnabled= false
              }
              is Resource.Success -> {
                  binding.progressBarlogin.visibility = View.GONE
                  findNavController().navigate(R.id.action_login_to_mnuPrincipal)
                  Toast.makeText(context,"bienvenido",Toast.LENGTH_SHORT).show()

              }
              is Resource.Failure -> {
                  binding.progressBarlogin.visibility = View.GONE
                  binding.login.isEnabled=true
                  Toast.makeText(context,"error:${result.exeption}",Toast.LENGTH_SHORT).show()
              }
          }
        })
    }


}