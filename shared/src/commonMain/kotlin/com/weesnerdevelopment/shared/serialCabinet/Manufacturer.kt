package com.weesnerdevelopment.shared.serialCabinet

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericItem
import com.weesnerdevelopment.shared.base.History
import com.weesnerdevelopment.shared.base.HistoryItem
import com.weesnerdevelopment.shared.currentTimeMillis

/**
 * Manufacturer of Serial Cabinet items.
 *
 * @param name The name of the category.
 *
 * @see GenericItem.id
 * @see GenericItem.dateCreated
 * @see GenericItem.dateUpdated
 * @see HistoryItem.history
 */
@Parcelize
data class Manufacturer(
    override var id: Int? = null,
    val name: String,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis(),
    override var history: List<History>? = null
) : GenericItem, HistoryItem, Parcelable
