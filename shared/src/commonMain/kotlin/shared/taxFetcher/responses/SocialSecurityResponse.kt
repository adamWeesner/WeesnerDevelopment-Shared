package shared.taxFetcher.responses

import shared.base.GenericResponse
import shared.taxFetcher.SocialSecurity

data class SocialSecurityResponse(
    override var items: List<SocialSecurity>? = null
) : GenericResponse<SocialSecurity>
