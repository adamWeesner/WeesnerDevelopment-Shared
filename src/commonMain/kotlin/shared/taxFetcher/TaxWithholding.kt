package shared.taxFetcher

import shared.base.GenericItem
import shared.base.History
import shared.base.HistoryItem
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
 * @see HistoryItem.history
 */
data class TaxWithholding(
    override val id: Int? = null,
    val year: Int,
    val type: TaxWithholdingTypes,
    val payPeriod: PayPeriod,
    val amount: Double,
    override var history: MutableList<History>? = null,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem, HistoryItem
