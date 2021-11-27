package com.weesnerdevelopment.shared.billMan.responses

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.billMan.IncomeOccurrence

@Parcelize
data class IncomeOccurrencesResponse(
    override var items: List<IncomeOccurrence> = emptyList()
) : GenericResponse<IncomeOccurrence>, Parcelable