package com.weesnerdevelopment.shared.zelda.responses

import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.zelda.Effect
import kotlinx.serialization.Serializable

@Serializable
data class EffectsResponse(
    override var items: List<Effect> = emptyList()
) : GenericResponse<Effect>
