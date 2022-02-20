package com.weesnerdevelopment.shared.serialCabinet.responses

import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.serialCabinet.Manufacturer
import kotlinx.serialization.Serializable

@Serializable
data class ManufacturersResponse(
    override var items: List<Manufacturer> = emptyList()
) : GenericResponse<Manufacturer>