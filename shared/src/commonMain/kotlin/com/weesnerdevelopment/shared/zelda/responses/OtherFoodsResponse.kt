package com.weesnerdevelopment.shared.zelda.responses

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.zelda.OtherFood

@Parcelize
data class OtherFoodsResponse(
    override var items: List<OtherFood>? = null
) : GenericResponse<OtherFood>, Parcelable
