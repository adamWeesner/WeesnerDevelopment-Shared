package taxFetcher

import base.GenericItem
import currentTimeMillis

data class MedicareLimit(
    override val id: Int? = null,
    val year: Int,
    val maritalStatus: MaritalStatus,
    val amount: Int,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem
