package com.weesnerdevelopment.shared.billMan.responses

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.billMan.Category

@Parcelize
data class CategoriesResponse(
    override var items: List<Category>? = null
) : GenericResponse<Category>, Parcelable
