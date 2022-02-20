package com.weesnerdevelopment.shared.billMan.responses

import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.billMan.Bill
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("billsResponse")
data class BillsResponse(
    override var items: List<Bill> = emptyList()
) : GenericResponse<Bill>
