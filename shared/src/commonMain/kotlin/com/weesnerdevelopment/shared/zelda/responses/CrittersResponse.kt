package com.weesnerdevelopment.shared.zelda.responses

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.zelda.Critter

@Parcelize
data class CrittersResponse(
    override var items: List<Critter>? = null
) : GenericResponse<Critter>, Parcelable
