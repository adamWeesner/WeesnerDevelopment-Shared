package com.weesnerdevelopment.shared.zelda.responses

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.zelda.MonsterPart

@Parcelize
data class MonsterPartsResponse(
    override var items: List<MonsterPart> = emptyList()
) : GenericResponse<MonsterPart>, Parcelable
