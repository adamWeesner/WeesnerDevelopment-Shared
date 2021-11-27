package com.weesnerdevelopment.shared.taxFetcher.responses

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.taxFetcher.Medicare

@Parcelize
data class MedicareResponse(
    override var items: List<Medicare>? = null
) : GenericResponse<Medicare>, Parcelable
