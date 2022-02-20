package com.weesnerdevelopment.shared.billMan.responses

import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.billMan.Category
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("categoriesResponse")
data class CategoriesResponse(
    override var items: List<Category> = emptyList()
) : GenericResponse<Category>
