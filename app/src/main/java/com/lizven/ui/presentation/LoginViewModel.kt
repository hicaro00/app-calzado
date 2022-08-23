package com.lizven.ui.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.lizven.core.Resource

import com.lizven.repository.login.loginRepo
import kotlinx.coroutines.Dispatchers

class LoginViewModel (private val repo:loginRepo): ViewModel(){

    fun signIn(email:String,password: String) = liveData(Dispatchers.IO){
        emit(Resource.Loading())
        try {
            emit(Resource.Success(repo.singIn(email,password)))
        }catch (e:Exception){
            emit(Resource.Failure(e))
        }
    }

}

class LoginViewModelFactory(private val repo:loginRepo):ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return LoginViewModel(repo) as T
    }


}
