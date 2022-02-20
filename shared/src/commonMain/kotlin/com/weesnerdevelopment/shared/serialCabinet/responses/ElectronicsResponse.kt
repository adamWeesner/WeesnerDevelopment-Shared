package com.weesnerdevelopment.shared.serialCabinet.responses

import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.serialCabinet.Electronic
import kotlinx.serialization.Serializable

@Serializable
data class ElectronicsResponse(
    override var items: List<Electronic> = emptyList()
) : GenericResponse<Electronic>