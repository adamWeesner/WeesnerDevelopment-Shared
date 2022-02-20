package com.weesnerdevelopment.shared.taxFetcher.responses

import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.taxFetcher.Medicare
import kotlinx.serialization.Serializable

@Serializable
data class MedicareResponse(
    override var items: List<Medicare> = emptyList()
) : GenericResponse<Medicare>
