package com.weesnerdevelopment.shared.zelda.responses

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.zelda.Ingredient

@Parcelize
data class IngredientsResponse(
    override var items: List<Ingredient>? = null
) : GenericResponse<Ingredient>, Parcelable
