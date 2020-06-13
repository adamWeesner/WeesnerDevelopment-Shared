package shared

import com.squareup.moshi.Moshi
import java.lang.reflect.ParameterizedType

/**
 * A [Moshi] instance that can take a [ParameterizedType] if needed.
 */
inline fun <reified T> moshi(type: ParameterizedType? = null) =
    Moshi.Builder().build().adapter<T>(type ?: T::class.java)

actual inline fun <reified T> String.fromJson(): T? = moshi<T>().fromJson(this)

actual inline fun <reified T> T?.toJson(): String? = moshi<T>().toJson(this)

actual fun currentTimeMillis() = System.currentTimeMillis()
