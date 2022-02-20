package com.weesnerdevelopment.shared.zelda.responses

import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.zelda.Critter
import kotlinx.serialization.Serializable

@Serializable
data class CrittersResponse(
    override var items: List<Critter> = emptyList()
) : GenericResponse<Critter>
