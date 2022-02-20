package com.weesnerdevelopment.shared.taxFetcher.responses

import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.taxFetcher.FederalIncomeTax
import kotlinx.serialization.Serializable

@Serializable
data class FederalIncomeTaxResponse(
    override var items: List<FederalIncomeTax> = emptyList()
) : GenericResponse<FederalIncomeTax>
