package com.weesnerdevelopment.shared.taxFetcher

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericItem
import com.weesnerdevelopment.shared.base.History
import com.weesnerdevelopment.shared.base.HistoryItem
import com.weesnerdevelopment.shared.currentTimeMillis

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
@Parcelize
data class TaxWithholding(
    override val id: Int? = null,
    val year: Int,
    val type: TaxWithholdingTypes,
    val payPeriod: PayPeriod,
    val amount: Double,
    override var history: List<History>? = null,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem, HistoryItem, Parcelable
