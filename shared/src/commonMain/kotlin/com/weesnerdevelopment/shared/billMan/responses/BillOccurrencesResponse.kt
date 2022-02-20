package com.weesnerdevelopment.shared.billMan.responses

import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.billMan.BillOccurrence
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("billOccurrencesResponse")
data class BillOccurrencesResponse(
    override var items: List<BillOccurrence> = emptyList()
) : GenericResponse<BillOccurrence>
