package com.weesnerdevelopment.shared.taxFetcher.responses

import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.taxFetcher.SocialSecurity
import kotlinx.serialization.Serializable

@Serializable
data class SocialSecurityResponse(
    override var items: List<SocialSecurity> = emptyList()
) : GenericResponse<SocialSecurity>
