package com.weesnerdevelopment.shared.auth

import android.util.Base64
import java.nio.charset.Charset
import java.security.SecureRandom
import javax.crypto.Cipher
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.GCMParameterSpec
import javax.crypto.spec.PBEKeySpec
import javax.crypto.spec.SecretKeySpec

/**
 * @author Fidel Nunez Kanut
 * two way symmetric encryption using 256 bit key + "AES/GCM/NoPadding"
 * [https://github.com/fnunezkanut/kotlin-symmetric-encryption-example/blob/master/src/main/kotlin/com/github/fnunezkanut/SymmetricEncryption.kt]
 */
actual class SymmetricEncryption {
    //symmetric encryption constants for 256 bit AES/GCM/NoPadding
    private val algorithm = "AES/GCM/NoPadding"
    private val nonceSize = 12
    private val tagSize = 128
    private val keySize = 256
    private val pbkdf2Name = "PBKDF2WithHmacSHA256"
    private val saltSize = 16
    private val iterations = 32767

    actual fun encrypt(data: String, secret: String): String {
        //generate a salt using a CSPRNG
        val secureRandom = SecureRandom()
        val salt = ByteArray(saltSize)
        secureRandom.nextBytes(salt)

        //create an instance of PBKDF2 and derive a key.
        val pwSpec = PBEKeySpec(secret.toCharArray(), salt, iterations, keySize)
        val keyFactory: SecretKeyFactory = SecretKeyFactory.getInstance(pbkdf2Name)
        val key: ByteArray = keyFactory.generateSecret(pwSpec).encoded

        //encrypt and prepend salt.
        val dataWNonce: ByteArray = encryptByteArray(data.toByteArray(Charset.forName("UTF-8")), key)
        val dataWNonceAndSalt = ByteArray(salt.size + dataWNonce.size)
        System.arraycopy(salt, 0, dataWNonceAndSalt, 0, salt.size)
        System.arraycopy(dataWNonce, 0, dataWNonceAndSalt, salt.size, dataWNonce.size)

        //ensure data is properly encoded
        return Base64.encodeToString(dataWNonceAndSalt, Base64.DEFAULT)
    }

    actual fun decrypt(data: String, secret: String): String {
        //decode from base64
        val decodedData: ByteArray = Base64.decode(data, Base64.DEFAULT)

        //retrieve the salt and ciphertextAndNonce.
        val salt = ByteArray(saltSize)
        val decodedDataWNonce = ByteArray(decodedData.size - saltSize)
        System.arraycopy(decodedData, 0, salt, 0, salt.size)
        System.arraycopy(decodedData, salt.size, decodedDataWNonce, 0, decodedDataWNonce.size)

        //create an instance of PBKDF2 and derive the key.
        val pwSpec = PBEKeySpec(secret.toCharArray(), salt, iterations, keySize)
        val keyFactory: SecretKeyFactory = SecretKeyFactory.getInstance(pbkdf2Name)
        val key: ByteArray = keyFactory.generateSecret(pwSpec).encoded

        //decrypt and return result.
        return String(decryptByteArray(decodedDataWNonce, key))
    }

    private fun encryptByteArray(data: ByteArray, key: ByteArray): ByteArray {
        //generate a 96-bit nonce using a CSPRNG.
        val secureRandom = SecureRandom()
        val nonce = ByteArray(nonceSize)
        secureRandom.nextBytes(nonce)

        //create the cipher instance and initialize.
        val cipher: Cipher = Cipher.getInstance(algorithm)
        cipher.init(Cipher.ENCRYPT_MODE, SecretKeySpec(key, "AES"), GCMParameterSpec(tagSize, nonce))

        //encrypt and prepend nonce.
        val encryptedData: ByteArray = cipher.doFinal(data)
        val encryptedDataWNonce = ByteArray(nonce.size + encryptedData.size)
        System.arraycopy(nonce, 0, encryptedDataWNonce, 0, nonce.size)
        System.arraycopy(encryptedData, 0, encryptedDataWNonce, nonce.size, encryptedData.size)

        return encryptedDataWNonce
    }

    private fun decryptByteArray(data: ByteArray, key: ByteArray): ByteArray {
        //retrieve the nonce and data.
        val nonce = ByteArray(nonceSize)
        val dataBytes = ByteArray(data.size - nonceSize)
        System.arraycopy(data, 0, nonce, 0, nonce.size)
        System.arraycopy(data, nonce.size, dataBytes, 0, dataBytes.size)

        //create the cipher instance and initialize.
        val cipher: Cipher = Cipher.getInstance(algorithm)
        cipher.init(Cipher.DECRYPT_MODE, SecretKeySpec(key, "AES"), GCMParameterSpec(tagSize, nonce))

        //decrypt and return result.
        return cipher.doFinal(dataBytes)
    }
}
