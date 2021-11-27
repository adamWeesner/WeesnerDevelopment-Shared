package com.weesnerdevelopment.shared.auth

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize

/**
 * Invalid User Exception to generate useful json formatted errors when there are user exceptions.
 */
@Parcelize
data class InvalidUserException(
    val url: String,
    val statusCode: Int? = -1,
    val reasonCode: Int
) : Parcelable
