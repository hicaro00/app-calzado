package com.lizven.data.remote.loginFirebase


import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext



class LoginDatasource {

    suspend fun sigIn(email: String, password: String): FirebaseUser? {
        return withContext(Dispatchers.IO) {
            val authResult = FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password).await()
            authResult.user
        }
    }




}