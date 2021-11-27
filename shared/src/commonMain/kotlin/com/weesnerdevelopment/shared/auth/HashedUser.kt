package com.weesnerdevelopment.shared.auth

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize

/**
 * Hashed representation of a [User] that has a hashed [username] and [password] that should be gotten from a JWT.
 *
 * @see User.username
 * @see User.password
 */
@Parcelize
data class HashedUser(
    val username: String,
    val password: String
) : Parcelable
