package com.weesnerdevelopment.shared.zelda.responses

import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.zelda.CookingPotFood
import kotlinx.serialization.Serializable

@Serializable
data class CookingPotFoodsResponse(
    override var items: List<CookingPotFood> = emptyList()
) : GenericResponse<CookingPotFood>
