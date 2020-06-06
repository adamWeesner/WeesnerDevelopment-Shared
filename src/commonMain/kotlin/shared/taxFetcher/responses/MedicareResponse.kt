package shared.taxFetcher.responses

import shared.base.GenericResponse
import shared.taxFetcher.Medicare

data class MedicareResponse(
    override var items: List<Medicare>? = null
) : GenericResponse<Medicare>
