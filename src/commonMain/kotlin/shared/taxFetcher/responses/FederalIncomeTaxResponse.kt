package shared.taxFetcher.responses

import shared.base.GenericResponse
import shared.taxFetcher.FederalIncomeTax

data class FederalIncomeTaxResponse(
    override var items: List<FederalIncomeTax>? = null
) : GenericResponse<FederalIncomeTax>
