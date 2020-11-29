package shared.serialCabinet.responses

import shared.base.GenericResponse
import shared.serialCabinet.Electronic

data class ElectronicsResponse(
    override var items: List<Electronic>? = null
) : GenericResponse<Electronic>