package com.weesnerdevelopment.shared.taxFetcher.responses

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericResponse
import com.weesnerdevelopment.shared.taxFetcher.SocialSecurity

@Parcelize
data class SocialSecurityResponse(
    override var items: List<SocialSecurity>? = null
) : GenericResponse<SocialSecurity>, Parcelable
