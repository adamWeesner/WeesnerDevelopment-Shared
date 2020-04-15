import kotlin.js.Date

actual inline fun <reified T> T?.toJson(): String? = JSON.stringify(this)

actual inline fun <reified T> String.fromJson(): T? = JSON.parse(this)

actual fun currentTimeMillis() = Date.now().toLong()