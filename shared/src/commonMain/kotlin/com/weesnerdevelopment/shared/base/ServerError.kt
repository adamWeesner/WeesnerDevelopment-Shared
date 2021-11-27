package com.weesnerdevelopment.shared.base

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize

/**
 * Server Error generating a nice looking json error when there is a server issue.
 */
@Parcelize
data class ServerError(
    val status: String,
    val statusCode: Int,
    val message: String
) : Parcelable