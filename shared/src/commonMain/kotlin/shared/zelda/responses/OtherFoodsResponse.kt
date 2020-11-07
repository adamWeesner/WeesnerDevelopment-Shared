package shared.zelda.responses

import shared.base.GenericResponse
import shared.zelda.OtherFood

data class OtherFoodsResponse(
    override var items: List<OtherFood>? = null
) : GenericResponse<OtherFood>
