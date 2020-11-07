package shared.zelda.responses

import shared.base.GenericResponse
import shared.zelda.FrozenFood

data class FrozenFoodsResponse(
    override var items: List<FrozenFood>? = null
) : GenericResponse<FrozenFood>
