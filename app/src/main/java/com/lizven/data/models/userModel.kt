package com.lizven.data.models

data class userModel(
    val id: String,
    val Profile_name:String,
    val Profile_contact: String? = null,
    val pass: String,
    val Profile_cargo: String?,
    val Name_Enterprises: String? = null,
    val profile_Photo: String? = null,
)