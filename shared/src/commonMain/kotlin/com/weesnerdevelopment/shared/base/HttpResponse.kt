package com.weesnerdevelopment.shared.base

import com.weesnerdevelopment.shared.auth.InvalidUserException
import com.weesnerdevelopment.shared.toJson
import kotlinx.serialization.Serializable

/**
 * The Http status for the given network request.
 *
 * @param code The status code of the request.
 * @param description The description of the status for the request.
 */
@Serializable
data class HttpStatus(val code: Int, val description: String) {
    companion object {
        val OK = HttpStatus(200, "OK")
        val Created = HttpStatus(201, "Created")
        val NoContent = HttpStatus(204, "No Content")
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
@Serializable
data class Response(val status: HttpStatus, val message: String?) {
    companion object {
        fun Ok(message: String) = Response(HttpStatus.OK, message)
        fun Created(message: String) = Response(HttpStatus.Created, message)
        fun NoContent(message: String) = Response(HttpStatus.NoContent, message)
        fun BadRequest(message: String) = Response(HttpStatus.BadRequest, message)
        fun NotFound(message: String) = Response(HttpStatus.NotFound, message)
        fun Conflict(message: String) = Response(HttpStatus.Conflict, message)
        fun InternalError(message: String) = Response(HttpStatus.InternalServerError, message)
        fun Unauthorized(reason: InvalidUserException) = Response(HttpStatus.Unauthorized, reason.toJson())
    }
}
