package taxFetcher

import base.GenericItem
import currentTimeMillis

data class FederalIncomeTax(
    override val id: Int? = null,
    val year: Int,
    val maritalStatus: MaritalStatus,
    val payPeriod: PayPeriod,
    val over: Double,
    val notOver: Double,
    val plus: Double,
    val percent: Double,
    val nonTaxable: Double,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem
