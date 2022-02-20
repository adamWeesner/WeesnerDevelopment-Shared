package com.weesnerdevelopment.shared.zelda.responses

import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.zelda.FrozenFood
import kotlinx.serialization.Serializable

@Serializable
data class FrozenFoodsResponse(
    override var items: List<FrozenFood> = emptyList()
) : GenericResponse<FrozenFood>
