package com.weesnerdevelopment.shared.serialCabinet.responses

import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.serialCabinet.Category
import kotlinx.serialization.Serializable

@Serializable
data class CategoriesResponse(
    override var items: List<Category> = emptyList()
) : GenericResponse<Category>
