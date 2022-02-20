package com.weesnerdevelopment.shared.zelda.responses

import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.zelda.OtherFood
import kotlinx.serialization.Serializable

@Serializable
data class OtherFoodsResponse(
    override var items: List<OtherFood> = emptyList()
) : GenericResponse<OtherFood>
