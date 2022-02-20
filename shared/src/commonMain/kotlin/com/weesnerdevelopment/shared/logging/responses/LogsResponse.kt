package com.weesnerdevelopment.shared.logging.responses

import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.logging.Log
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("logsResponse")
data class LogsResponse(
    override var items: List<Log> = emptyList()
) : GenericResponse<Log>
