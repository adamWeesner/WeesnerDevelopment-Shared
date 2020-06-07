package shared.auth

/**
 * Response for user token.
 *
 * @param token The token of the signed in user.
 */
data class TokenResponse(val token: String?)
