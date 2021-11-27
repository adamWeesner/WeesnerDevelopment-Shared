package com.weesnerdevelopment.shared.zelda.responses

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.zelda.FrozenFood

@Parcelize
data class FrozenFoodsResponse(
    override var items: List<FrozenFood> = emptyList()
) : GenericResponse<FrozenFood>, Parcelable
