package com.lizven.repository.login

import com.google.firebase.auth.FirebaseUser
import com.lizven.data.remote.loginFirebase.LoginDatasource
import com.lizven.repository.login.loginRepo

class LoginRepoImplenent (private val datasource:LoginDatasource): loginRepo {
    override suspend fun singIn(email: String, password: String): FirebaseUser? = datasource.sigIn(email,password)

}