package com.weesnerdevelopment.shared.auth

import kotlinx.serialization.Serializable

/**
 * Response for user token.
 *
 * @param token The token of the signed in user.
 */
@Serializable
data class TokenResponse(val token: String?)
