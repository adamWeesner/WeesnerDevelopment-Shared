package shared.taxFetcher.responses

import shared.base.GenericResponse
import shared.taxFetcher.TaxWithholding

data class TaxWithholdingResponse(
    override var items: List<TaxWithholding>? = null
) : GenericResponse<TaxWithholding>
