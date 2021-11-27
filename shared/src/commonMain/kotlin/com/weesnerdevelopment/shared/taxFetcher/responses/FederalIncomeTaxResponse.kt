package com.weesnerdevelopment.shared.taxFetcher.responses

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.taxFetcher.FederalIncomeTax

@Parcelize
data class FederalIncomeTaxResponse(
    override var items: List<FederalIncomeTax>? = null
) : GenericResponse<FederalIncomeTax>, Parcelable
