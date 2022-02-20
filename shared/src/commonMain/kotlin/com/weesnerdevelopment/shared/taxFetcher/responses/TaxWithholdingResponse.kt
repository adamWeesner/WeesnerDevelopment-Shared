package com.weesnerdevelopment.shared.taxFetcher.responses

import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.taxFetcher.TaxWithholding
import kotlinx.serialization.Serializable

@Serializable
data class TaxWithholdingResponse(
    override var items: List<TaxWithholding> = emptyList()
) : GenericResponse<TaxWithholding>
