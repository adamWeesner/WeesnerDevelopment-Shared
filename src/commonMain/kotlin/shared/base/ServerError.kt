package shared.base

/**
 * Server Error generating a nice looking json error when there is a server issue.
 */
data class ServerError(
    val status: String,
    val statusCode: Int,
    val message: Any
)