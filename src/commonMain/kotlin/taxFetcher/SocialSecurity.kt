package taxFetcher

import base.GenericItem
import currentTimeMillis

data class SocialSecurity(
    override val id: Int? = null,
    val year: Int,
    val percent: Double,
    val limit: Int,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem
