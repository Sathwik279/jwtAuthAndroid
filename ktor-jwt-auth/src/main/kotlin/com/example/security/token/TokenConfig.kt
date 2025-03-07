package com.example.security.token

data class TokenConfig(
    val issuer: String,
    val audience: String, // we have different types of token for different types of audience
    val expiresIn: Long,
    val secret: String
)