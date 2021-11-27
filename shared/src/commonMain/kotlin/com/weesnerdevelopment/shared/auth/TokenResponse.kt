package com.weesnerdevelopment.shared.auth

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize

/**
 * Response for user token.
 *
 * @param token The token of the signed in user.
 */
@Parcelize
data class TokenResponse(val token: String?) : Parcelable
