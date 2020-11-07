package shared.zelda.responses

import shared.base.GenericResponse
import shared.zelda.Critter

data class CrittersResponse(
    override var items: List<Critter>? = null
) : GenericResponse<Critter>
