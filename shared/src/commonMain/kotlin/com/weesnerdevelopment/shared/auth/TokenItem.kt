package com.weesnerdevelopment.shared.auth

interface TokenItem {
    /**
     * Auth token of the item
     */
    val authToken: String

    /**
     * Refresh token of the item, used to generate a new auth token
     */
    val refreshToken: String

    /**
     * How long until the [authToken] expires, from when it was generated
     */
    val expiresIn: Long
}