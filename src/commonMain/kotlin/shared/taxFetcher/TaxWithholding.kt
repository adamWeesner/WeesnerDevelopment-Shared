package shared.taxFetcher

import shared.base.GenericItem
import shared.currentTimeMillis

/**
 * Tax withholding item, this represents some of the data to determine how much [FederalIncomeTax] will be taken for a
 * given gross income amount.
 *
 * @param year The year given.
 * @param type The [TaxWithholdingTypes].
 * @param payPeriod The [PayPeriod].
 * @param amount The amount each withholding item is worth.
 *
 * @see GenericItem.id
 * @see GenericItem.dateCreated
 * @see GenericItem.dateUpdated
 */
data class TaxWithholding(
    override val id: Int? = null,
    val year: Int,
    val type: TaxWithholdingTypes,
    val payPeriod: PayPeriod,
    val amount: Double,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem
