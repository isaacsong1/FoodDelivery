package com.fooddelivery.backend.models

import org.mindrot.jbcrypt.BCrypt

data class User(
    val email: String,
    private val passwordHash: String,
    val location: String
)