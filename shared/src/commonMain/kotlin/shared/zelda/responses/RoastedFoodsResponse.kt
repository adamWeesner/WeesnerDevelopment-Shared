package shared.zelda.responses

import shared.base.GenericResponse
import shared.zelda.RoastedFood

data class RoastedFoodsResponse(
    override var items: List<RoastedFood>? = null
) : GenericResponse<RoastedFood>
