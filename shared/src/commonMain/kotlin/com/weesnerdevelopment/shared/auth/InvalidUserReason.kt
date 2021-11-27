package com.weesnerdevelopment.shared.auth

/**
 * Reasons as to why there was a [InvalidUserException].
 */
enum class InvalidUserReason(val code: Int) {
    /**
     * Catch all for generic invalid user.
     */
    General(1000),

    /**
     * Expired user token.
     */
    Expired(1001),

    /**
     * Invalid formatted jwt, or missing jwt values.
     */
    InvalidJwt(1002),

    /**
     * No user found in the database matching the given credentials.
     */
    NoUserFound(1003),

    /**
     * Not valid hashed user data, ie: something is not valid [Base64] data.
     */
    InvalidUserInfo(1004),

    /**
     * Not a user that can access this.
     */
    WrongUser(1005)
}
