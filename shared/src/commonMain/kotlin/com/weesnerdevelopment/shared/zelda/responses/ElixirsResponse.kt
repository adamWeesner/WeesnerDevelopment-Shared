package com.weesnerdevelopment.shared.zelda.responses

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.zelda.Elixir

@Parcelize
data class ElixirsResponse(
    override var items: List<Elixir> = emptyList()
) : GenericResponse<Elixir>, Parcelable
