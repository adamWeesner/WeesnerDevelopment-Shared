package taxFetcher

import base.GenericItem
import currentTimeMillis

data class Medicare(
    override val id: Int? = null,
    val year: Int,
    val percent: Double,
    val additionalPercent: Double,
    val limits: List<MedicareLimit>,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem
