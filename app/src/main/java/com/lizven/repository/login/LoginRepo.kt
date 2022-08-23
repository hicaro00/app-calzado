package com.lizven.repository.login

import com.google.firebase.auth.FirebaseUser

interface loginRepo {

    suspend fun singIn (email:String,Password:String): FirebaseUser?
}