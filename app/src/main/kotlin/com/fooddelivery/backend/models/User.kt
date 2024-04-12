package com.fooddelivery.backend.models

import org.mindrot.jbcrypt.BCrypt

data class User(
    val email: String,
    val password: String,
    val location: String
)