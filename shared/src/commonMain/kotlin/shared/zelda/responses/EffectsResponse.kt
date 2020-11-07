package shared.zelda.responses

import shared.base.GenericResponse
import shared.zelda.Effect

data class EffectsResponse(
    override var items: List<Effect>? = null
) : GenericResponse<Effect>
