package shared.zelda.responses

import shared.base.GenericResponse
import shared.zelda.MonsterPart

data class MonsterPartsResponse(
    override var items: List<MonsterPart>? = null
) : GenericResponse<MonsterPart>
