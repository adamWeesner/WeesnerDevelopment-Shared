package com.weesnerdevelopment.shared.zelda.responses

import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.zelda.Elixir
import kotlinx.serialization.Serializable

@Serializable
data class ElixirsResponse(
    override var items: List<Elixir> = emptyList()
) : GenericResponse<Elixir>
