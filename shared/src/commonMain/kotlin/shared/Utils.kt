package shared

/**
 * Helper function that creates an object of type [T] from a json string.
 */
expect inline fun <reified T> String.fromJson(): T?

/**
 * Helper function to convert an object to a json string.
 */
expect inline fun <reified T> T?.toJson(): String?

/**
 * Get the current system time.
 */
expect fun currentTimeMillis(): Long
