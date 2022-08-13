package com.lizven.repository

import com.google.firebase.auth.FirebaseUser

interface loginRepo {

    fun singIn (User:String,Password:String): FirebaseUser?
}