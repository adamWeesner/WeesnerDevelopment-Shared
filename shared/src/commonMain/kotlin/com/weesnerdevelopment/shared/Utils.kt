package com.weesnerdevelopment.shared

import com.weesnerdevelopment.shared.billMan.responses.*
import kotlinx.serialization.KSerializer
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonBuilder
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.SerializersModuleBuilder


inline fun <reified Base : Any, reified Sub : Base> SerializersModuleBuilder.poly(serializer: KSerializer<Sub>) {
    polymorphic(
        Base::class,
        Sub::class,
        serializer
    )
}

val responseModule = SerializersModule {
    poly(IncomeOccurrencesResponse.serializer())
    poly(BillOccurrencesResponse.serializer())
    poly(BillsResponse.serializer())
    poly(CategoriesResponse.serializer())
    poly(IncomeResponse.serializer())
}

fun json(jsonParams: JsonBuilder.() -> Unit) = Json {
    ignoreUnknownKeys = true
    encodeDefaults = true
    serializersModule = responseModule
    jsonParams(this)
}

/**
 * Helper function that creates an object of type [T] from a json string.
 */
inline fun <reified T> String.fromJson(noinline jsonParams: JsonBuilder.() -> Unit = {}): T =
    json(jsonParams).decodeFromString(this)

/**
 * Helper function to convert an object to a json string.
 */
inline fun <reified T> T.toJson(noinline jsonParams: JsonBuilder.() -> Unit = {}): String =
    json(jsonParams).encodeToString(this)

/**
 * Get the current system time.
 */
expect fun currentTimeMillis(): Long
