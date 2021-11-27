package com.weesnerdevelopment.shared.taxFetcher

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericItem
import com.weesnerdevelopment.shared.base.History
import com.weesnerdevelopment.shared.base.HistoryItem
import com.weesnerdevelopment.shared.currentTimeMillis

/**
 * Medicare limit item, this represents the limit for the given [maritalStatus] and [year].
 *
 * @param year The year given.
 * @param maritalStatus The [MaritalStatus].
 * @param amount The amount of the limit.
 *
 * @see GenericItem.id
 * @see GenericItem.dateCreated
 * @see GenericItem.dateUpdated
 * @see HistoryItem.history
 */
@Parcelize
data class MedicareLimit(
    override val id: Int? = null,
    val year: Int,
    val maritalStatus: MaritalStatus,
    val amount: Int,
    override var history: List<History>? = null,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem, HistoryItem, Parcelable
