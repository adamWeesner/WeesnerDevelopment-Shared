package com.weesnerdevelopment.shared.billMan.responses

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.billMan.Bill

@Parcelize
data class BillsResponse(
    override var items: List<Bill>? = null
) : GenericResponse<Bill>, Parcelable
