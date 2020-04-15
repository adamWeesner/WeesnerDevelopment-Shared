expect inline fun <reified T> String.fromJson(): T?

expect inline fun <reified T> T?.toJson(): String?

expect fun currentTimeMillis(): Long
