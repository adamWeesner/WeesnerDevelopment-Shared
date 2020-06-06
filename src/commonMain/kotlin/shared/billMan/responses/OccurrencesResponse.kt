package shared.billMan.responses

import shared.base.GenericResponse
import shared.billMan.Occurrence

data class OccurrencesResponse(
    override var items: List<Occurrence>? = null
) : GenericResponse<Occurrence>
