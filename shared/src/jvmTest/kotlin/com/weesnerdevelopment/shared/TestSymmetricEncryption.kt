package com.weesnerdevelopment.shared

import com.weesnerdevelopment.shared.auth.SymmetricEncryption
import kotlin.test.Test
import kotlin.test.assertEquals

class TestSymmetricEncryption {
    @Test
    fun `encryption and decryption work properly`() {
        val secret = "this is a secret"
        val data = "adam.weesner"
        val encryption = SymmetricEncryption()

        val encryptedUser = encryption.encrypt(data, secret)
        println("user data $encryptedUser")
        val decryptedUser = encryption.decrypt(encryptedUser, secret)
        println("decrypted $decryptedUser")

        assertEquals(data, decryptedUser)
    }
}
