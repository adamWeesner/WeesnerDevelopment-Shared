package com.weesnerdevelopment.shared.serialCabinet.responses

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.serialCabinet.Manufacturer

@Parcelize
data class ManufacturersResponse(
    override var items: List<Manufacturer> = emptyList()
) : GenericResponse<Manufacturer>, Parcelable