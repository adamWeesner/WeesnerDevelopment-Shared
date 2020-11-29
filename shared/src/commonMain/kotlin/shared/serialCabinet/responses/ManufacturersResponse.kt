package shared.serialCabinet.responses

import shared.base.GenericResponse

data class ManufacturersResponse(
    override var items: List<ManufacturersResponse>? = null
) : GenericResponse<ManufacturersResponse>