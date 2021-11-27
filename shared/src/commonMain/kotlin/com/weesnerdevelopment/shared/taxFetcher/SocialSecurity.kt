package com.weesnerdevelopment.shared.taxFetcher

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericItem
import com.weesnerdevelopment.shared.base.History
import com.weesnerdevelopment.shared.base.HistoryItem
import com.weesnerdevelopment.shared.currentTimeMillis

/**
 * Social Security item, this represents the data to determine how much social security tax will be taken for a given
 * gross income amount. Here is an example of how this data would be used:
 * ```kotlin
 *    val socialSecurity = SocialSecurity(/* social security data */)
 *    val taxable = 100
 *    var taxAmount = if(taxable < socialSecurity.limit)
 *        taxable * socialSecurity.percent
 *    else
 *        0.0
 *
 *    // the amount that is to be taken out for social security tax
 *    println(taxAmount)
 * ```
 *
 * @param year The year given.
 * @param percent The percent of the taxable data to be taken.
 * @param limit The upper limit that can be taxed, if over this limit no more social security tax will be taken.
 *
 * @see GenericItem.id
 * @see GenericItem.dateCreated
 * @see GenericItem.dateUpdated
 * @see HistoryItem.history
 */
@Parcelize
data class SocialSecurity(
    override val id: Int? = null,
    val year: Int,
    val percent: Double,
    val limit: Int,
    override var history: List<History>? = null,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem, HistoryItem, Parcelable
