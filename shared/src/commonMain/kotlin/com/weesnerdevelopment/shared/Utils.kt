package com.weesnerdevelopment.shared

import com.weesnerdevelopment.shared.base.GenericItem
import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.billMan.responses.*
import kotlinx.serialization.PolymorphicSerializer
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonBuilder
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.SerializersModuleBuilder

internal inline fun <reified I : GenericItem, reified T : GenericResponse<I>> SerializersModuleBuilder.serializeGenericResponse() {
    polymorphic(
        GenericResponse::class,
        T::class,
        PolymorphicSerializer(T::class)
    )
}

val responseModule = SerializersModule {
    polymorphic(
        GenericResponse::class,
        IncomeOccurrencesResponse::class,
        IncomeOccurrencesResponse.serializer()
    )
    polymorphic(
        GenericResponse::class,
        BillOccurrencesResponse::class,
        BillOccurrencesResponse.serializer()
    )
    polymorphic(
        GenericResponse::class,
        BillsResponse::class,
        BillsResponse.serializer()
    )
    polymorphic(
        GenericResponse::class,
        CategoriesResponse::class,
        CategoriesResponse.serializer()
    )
    polymorphic(
        GenericResponse::class,
        IncomeResponse::class,
        IncomeResponse.serializer()
    )
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
