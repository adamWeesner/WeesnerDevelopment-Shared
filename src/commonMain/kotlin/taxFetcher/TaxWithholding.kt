package taxFetcher

import base.GenericItem
import currentTimeMillis

data class TaxWithholding(
    override val id: Int? = null,
    val year: Int,
    val type: TaxWithholdingTypes,
    val payPeriod: PayPeriod,
    val amount: Double,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem
