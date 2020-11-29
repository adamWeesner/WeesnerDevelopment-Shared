package shared.serialCabinet.responses

import shared.base.GenericResponse
import shared.serialCabinet.Manufacturer

data class ManufacturersResponse(
    override var items: List<Manufacturer>? = null
) : GenericResponse<Manufacturer>