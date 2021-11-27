package com.weesnerdevelopment.shared.zelda.responses

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.zelda.CookingPotFood

@Parcelize
data class CookingPotFoodsResponse(
    override var items: List<CookingPotFood> = emptyList()
) : GenericResponse<CookingPotFood>, Parcelable
