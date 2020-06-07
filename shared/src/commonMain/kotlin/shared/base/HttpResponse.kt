package shared.base

import shared.auth.InvalidUserException

/**
 * The Http status for the given network request.
 *
 * @param code The status code of the request.
 * @param description The description of the status for the request.
 */
data class HttpStatus(val code: Int, val description: String) {
    companion object {
        val OK = HttpStatus(200, "OK")
        val Created = HttpStatus(201, "Created")
        val BadRequest = HttpStatus(400, "Bad Request")
        val Unauthorized = HttpStatus(401, "Unauthorized")
        val NotFound = HttpStatus(404, "Not Found")
        val Conflict = HttpStatus(409, "Conflict")
        val InternalServerError = HttpStatus(500, "Internal Server Error")
    }
}

/**
 * Response that all network requests should be wrapped in.
 *
 * @param status The [HttpStatus] of the response.
 * @param message The message of the response.
 */
sealed class Response(val status: HttpStatus, val message: Any)
class Ok(message: Any) : Response(HttpStatus.OK, message)
class Created(message: Any?) : Response(HttpStatus.Created, message ?: "")
class BadRequest(message: String) : Response(HttpStatus.BadRequest, message)
class NotFound(message: String) : Response(HttpStatus.NotFound, message)
class Conflict(message: String) : Response(HttpStatus.Conflict, message)
class InternalError(message: String) : Response(HttpStatus.InternalServerError, message)
class Unauthorized(reason: InvalidUserException) : Response(HttpStatus.Unauthorized, reason)
