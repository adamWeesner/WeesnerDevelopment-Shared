package shared.billMan.responses

import shared.base.GenericResponse
import shared.billMan.Income

data class IncomeResponse(
    override var items: List<Income>? = null
) : GenericResponse<Income>
