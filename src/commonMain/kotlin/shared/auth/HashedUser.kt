package shared.auth

/**
 * Hashed representation of a [User] that has a hashed [username] and [password] that should be gotten from a JWT.
 *
 * @see User.username
 * @see User.password
 */
data class HashedUser(
    val username: String,
    val password: String
)
