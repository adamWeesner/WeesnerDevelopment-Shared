package com.weesnerdevelopment.shared.logging

import kotlinx.serialization.Serializable

/**
 * The log.
 *
 * @param time The local time string with the timezone information
 * @param logLevel The log level of the log
 * @param message The log message
 * @param app The application metadata the log was sent from
 */
@Serializable
data class Log(
    val time: String,
    val logLevel: LogLevel,
    val message: String,
    val app: App
)