package com.weesnerdevelopment.shared.zelda.responses

import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.zelda.MonsterPart
import kotlinx.serialization.Serializable

@Serializable
data class MonsterPartsResponse(
    override var items: List<MonsterPart> = emptyList()
) : GenericResponse<MonsterPart>
