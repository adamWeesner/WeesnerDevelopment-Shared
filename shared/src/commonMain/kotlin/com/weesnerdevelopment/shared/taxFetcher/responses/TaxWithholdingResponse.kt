package com.weesnerdevelopment.shared.taxFetcher.responses

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.taxFetcher.TaxWithholding

@Parcelize
data class TaxWithholdingResponse(
    override var items: List<TaxWithholding> = emptyList()
) : GenericResponse<TaxWithholding>, Parcelable
