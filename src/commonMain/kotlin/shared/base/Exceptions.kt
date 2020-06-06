package shared.base

class InvalidAttributeException(value: String) : IllegalArgumentException("$value is required but missing or invalid")

class EarlyResponseException(val response: Response) : Throwable()
