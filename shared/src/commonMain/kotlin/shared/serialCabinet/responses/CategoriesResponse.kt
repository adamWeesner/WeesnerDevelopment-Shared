package shared.serialCabinet.responses

import shared.base.GenericResponse
import shared.serialCabinet.Category

data class CategoriesResponse(
    override var items: List<Category>? = null
) : GenericResponse<Category>
