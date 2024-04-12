package com.fooddelivery.backend.models

import org.mindrot.jbcrypt.BCrypt

data class User(
    val email: String,
    private val passwordHash: String,
    val location: String
) {
    companion object {
        fun create(email: String, password: String, location: String): User {
            val passwordHash = hashPassword(password)
            return User(email, passwordHash, location)
        }

        private fun hashPassword(password: String): String {
            return BCrypt.hashpw(password, BCrypt.gensalt())
        }
    }
    fun checkPassword(password: String): Boolean {
        return BCrypt.checkpw(password, passwordHash)
    }
}