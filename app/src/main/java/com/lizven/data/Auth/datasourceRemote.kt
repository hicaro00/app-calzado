package com.lizven.data.Auth

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class datasourceRemote {

    suspend fun signInr(email:String, password :String):FirebaseUser?{

        return withContext(Dispatchers.IO){
            val authResult = FirebaseAuth.getInstance().signInWithEmailAndPassword(email,password).result
            authResult.user
        }
    }
}