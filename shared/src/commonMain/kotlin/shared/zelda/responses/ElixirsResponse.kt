package shared.zelda.responses

import shared.base.GenericResponse
import shared.zelda.Elixir

data class ElixirsResponse(
    override var items: List<Elixir>? = null
) : GenericResponse<Elixir>
