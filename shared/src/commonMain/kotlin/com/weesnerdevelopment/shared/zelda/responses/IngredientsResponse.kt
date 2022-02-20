package com.weesnerdevelopment.shared.zelda.responses

import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.zelda.Ingredient
import kotlinx.serialization.Serializable

@Serializable
data class IngredientsResponse(
    override var items: List<Ingredient> = emptyList()
) : GenericResponse<Ingredient>
