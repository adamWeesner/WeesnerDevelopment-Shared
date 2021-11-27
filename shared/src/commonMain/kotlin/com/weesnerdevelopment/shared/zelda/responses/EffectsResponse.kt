package com.weesnerdevelopment.shared.zelda.responses

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.zelda.Effect

@Parcelize
data class EffectsResponse(
    override var items: List<Effect>? = null
) : GenericResponse<Effect>, Parcelable
