package com.weesnerdevelopment.shared.auth

expect class SymmetricEncryption {
    fun encrypt(data: String, secret: String): String
    fun decrypt(data: String, secret: String): String
}
