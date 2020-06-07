package shared.billMan.responses

import shared.base.GenericResponse
import shared.billMan.Bill

data class BillsResponse(
    override var items: List<Bill>? = null
) : GenericResponse<Bill>
