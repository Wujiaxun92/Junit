package com.example.junit.user

import android.provider.ContactsContract.CommonDataKinds.Email

data class User (
    val id: Int,
    val name: String,
    val email: String
)