package com.weesnerdevelopment.shared.base

import com.weesnerdevelopment.shared.auth.InvalidUserException

/**
 * Response that all network requests should be wrapped in.
 *
 * @param status The [HttpStatus] of the response.
 * @param message The message of the response.
 */
sealed class Response<T : Any?>(
    open val status: HttpStatus,
    open val message: T
) {
    data class Ok<T : Any?>(override val message: T) :
        Response<T>(HttpStatus.OK, message)

    data class Created<T : Any?>(override val message: T) :
        Response<T>(HttpStatus.Created, message)

    data class NoContent<T : Any?>(override val message: T) :
        Response<T>(HttpStatus.NoContent, message)

    data class BadRequest<T : Any?>(override val message: T) :
        Response<T>(HttpStatus.BadRequest, message)

    data class NotFound<T : Any?>(override val message: T) :
        Response<T>(HttpStatus.NotFound, message)

    data class Conflict<T : Any?>(override val message: T) :
        Response<T>(HttpStatus.Conflict, message)

    data class InternalError<T : Any?>(override val message: T) :
        Response<T>(HttpStatus.InternalServerError, message)

    data class Unauthorized(val reason: InvalidUserException) :
        Response<InvalidUserException>(HttpStatus.Unauthorized, reason)
}
