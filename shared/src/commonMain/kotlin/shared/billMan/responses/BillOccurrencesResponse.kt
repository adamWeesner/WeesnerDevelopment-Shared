package shared.billMan.responses

import shared.base.GenericResponse
import shared.billMan.BillOccurrence

data class BillOccurrencesResponse(
    override var items: List<BillOccurrence>? = null
) : GenericResponse<BillOccurrence>
