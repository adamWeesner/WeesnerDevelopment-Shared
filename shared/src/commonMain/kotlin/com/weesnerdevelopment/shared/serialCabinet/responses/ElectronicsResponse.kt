package com.weesnerdevelopment.shared.serialCabinet.responses

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.serialCabinet.Electronic

@Parcelize
data class ElectronicsResponse(
    override var items: List<Electronic>? = null
) : GenericResponse<Electronic>, Parcelable