package com.weesnerdevelopment.shared.zelda.responses

import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.zelda.RoastedFood
import kotlinx.serialization.Serializable

@Serializable
data class RoastedFoodsResponse(
    override var items: List<RoastedFood> = emptyList()
) : GenericResponse<RoastedFood>
