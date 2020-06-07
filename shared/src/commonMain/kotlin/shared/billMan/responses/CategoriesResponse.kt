package shared.billMan.responses

import shared.base.GenericResponse
import shared.billMan.Category

data class CategoriesResponse(
    override var items: List<Category>? = null
) : GenericResponse<Category>
