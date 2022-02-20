package com.weesnerdevelopment.shared.auth

import kotlinx.serialization.Serializable

/**
 * Hashed representation of a [User] that has a hashed [username] and [password] that should be gotten from a JWT.
 *
 * @see User.username
 * @see User.password
 */
@Serializable
data class HashedUser(
    val username: String,
    val password: String
)