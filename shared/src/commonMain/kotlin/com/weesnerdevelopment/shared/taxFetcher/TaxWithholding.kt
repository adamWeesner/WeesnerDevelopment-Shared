package com.weesnerdevelopment.shared.taxFetcher

import com.weesnerdevelopment.shared.base.GenericItem
import com.weesnerdevelopment.shared.base.History
import com.weesnerdevelopment.shared.base.HistoryItem
import com.weesnerdevelopment.shared.currentTimeMillis
import kotlinx.serialization.Serializable

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
@Serializable
data class TaxWithholding(
    override val id: Int? = null,
    val year: Int,
    val type: TaxWithholdingTypes,
    val payPeriod: PayPeriod,
    val amount: Double,
    override var history: List<History>? = null,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem, HistoryItem
