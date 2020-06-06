package shared.auth

/**
 * Invalid User Exception to generate useful json formatted errors when there are user exceptions.
 */
data class InvalidUserException(
    val url: String,
    val statusCode: Int? = -1,
    val reasonCode: Int
)
