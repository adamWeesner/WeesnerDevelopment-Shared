package com.weesnerdevelopment.shared.billMan.responses

import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.billMan.Income
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("incomeResponse")
data class IncomeResponse(
    override var items: List<Income> = emptyList()
) : GenericResponse<Income>
