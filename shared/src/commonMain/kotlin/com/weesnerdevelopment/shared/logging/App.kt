package com.weesnerdevelopment.shared.logging

import kotlinx.serialization.Serializable

/**
 * the application metadata for a [Log].
 *
 * @param name The name of the application
 * @param version The version of the application
 * @param sessionId The session id of the application
 * @param environment The environment of the application
 */
@Serializable
data class App(
    val name: String,
    val version: String,
    val sessionId: String,
    val environment: String
)