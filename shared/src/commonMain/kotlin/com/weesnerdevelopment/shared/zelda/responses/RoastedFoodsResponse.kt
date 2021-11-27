package com.weesnerdevelopment.shared.zelda.responses

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.zelda.RoastedFood

@Parcelize
data class RoastedFoodsResponse(
    override var items: List<RoastedFood> = emptyList()
) : GenericResponse<RoastedFood>, Parcelable
