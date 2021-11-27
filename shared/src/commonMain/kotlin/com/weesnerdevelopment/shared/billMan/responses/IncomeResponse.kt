package com.weesnerdevelopment.shared.billMan.responses

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.billMan.Income

@Parcelize
data class IncomeResponse(
    override var items: List<Income> = emptyList()
) : GenericResponse<Income>, Parcelable
