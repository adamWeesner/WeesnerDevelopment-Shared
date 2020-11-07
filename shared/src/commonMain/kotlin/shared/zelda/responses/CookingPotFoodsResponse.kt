package shared.zelda.responses

import shared.base.GenericResponse
import shared.zelda.CookingPotFood

data class CookingPotFoodsResponse(
    override var items: List<CookingPotFood>? = null
) : GenericResponse<CookingPotFood>
