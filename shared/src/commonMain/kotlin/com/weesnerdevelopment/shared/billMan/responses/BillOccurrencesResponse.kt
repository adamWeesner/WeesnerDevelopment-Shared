package com.weesnerdevelopment.shared.billMan.responses

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.billMan.BillOccurrence

@Parcelize
data class BillOccurrencesResponse(
    override var items: List<BillOccurrence> = emptyList()
) : GenericResponse<BillOccurrence>, Parcelable
