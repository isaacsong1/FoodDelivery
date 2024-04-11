package com.fooddelivery.backend.models

data class User(
    val email: String,
    val password: String,
    val location: String
)