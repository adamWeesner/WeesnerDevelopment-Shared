package com.weesnerdevelopment.shared.serialCabinet.responses

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.serialCabinet.Category

@Parcelize
data class CategoriesResponse(
    override var items: List<Category> = emptyList()
) : GenericResponse<Category>, Parcelable
