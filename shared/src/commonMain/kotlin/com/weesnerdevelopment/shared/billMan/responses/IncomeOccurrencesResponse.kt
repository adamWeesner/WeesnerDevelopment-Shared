package com.weesnerdevelopment.shared.billMan.responses

import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.billMan.IncomeOccurrence
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("incomeOccurrencesResponse")
data class IncomeOccurrencesResponse(
    override var items: List<IncomeOccurrence> = emptyList()
) : GenericResponse<IncomeOccurrence>