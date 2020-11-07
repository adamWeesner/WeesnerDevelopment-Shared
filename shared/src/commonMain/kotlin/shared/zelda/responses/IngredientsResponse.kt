package shared.zelda.responses

import shared.base.GenericResponse
import shared.zelda.Ingredient

data class IngredientsResponse(
    override var items: List<Ingredient>? = null
) : GenericResponse<Ingredient>
