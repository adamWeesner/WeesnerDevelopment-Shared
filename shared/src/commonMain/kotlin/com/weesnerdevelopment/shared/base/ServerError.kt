package com.weesnerdevelopment.shared.base

import kotlinx.serialization.Serializable

/**
 * Server Error generating a nice looking json error when there is a server issue.
 */
@Serializable
data class ServerError(
    val status: String,
    val statusCode: Int,
    val message: String
)