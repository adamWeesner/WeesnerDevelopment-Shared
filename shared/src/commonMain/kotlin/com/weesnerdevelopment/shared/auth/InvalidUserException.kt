package com.weesnerdevelopment.shared.auth

import kotlinx.serialization.Serializable

/**
 * Invalid User Exception to generate useful json formatted errors when there are user exceptions.
 */
@Serializable
data class InvalidUserException(
    val url: String,
    val statusCode: Int? = -1,
    val reasonCode: Int
)
