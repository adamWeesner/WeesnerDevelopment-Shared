package com.weesnerdevelopment.shared.base

/**
 * The Http status for the given network request.
 *
 * @param code The status code of the request.
 * @param description The description of the status for the request.
 */
sealed class HttpStatus(val code: Int, val description: String) {
    object OK : HttpStatus(200, "OK")
    object Created : HttpStatus(201, "Created")
    object NoContent : HttpStatus(204, "No Content")
    object BadRequest : HttpStatus(400, "Bad Request")
    object Unauthorized : HttpStatus(401, "Unauthorized")
    object NotFound : HttpStatus(404, "Not Found")
    object Conflict : HttpStatus(409, "Conflict")
    object InternalServerError : HttpStatus(500, "Internal Server Error")
}
