package shared.billMan.responses

import shared.base.GenericResponse
import shared.billMan.IncomeOccurrence

data class IncomeOccurrencesResponse(
    override var items: List<IncomeOccurrence>? = null
) : GenericResponse<IncomeOccurrence>
