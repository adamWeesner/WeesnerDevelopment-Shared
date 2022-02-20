package com.weesnerdevelopment.shared.serialCabinet

import com.weesnerdevelopment.shared.base.GenericItem
import com.weesnerdevelopment.shared.base.History
import com.weesnerdevelopment.shared.base.HistoryItem
import com.weesnerdevelopment.shared.currentTimeMillis
import kotlinx.serialization.Serializable

/**
 * Category for Serial Cabinet items.
 *
 * @param name The name of the category.
 * @param description The description of the category.
 *
 * @see GenericItem.id
 * @see GenericItem.dateCreated
 * @see GenericItem.dateUpdated
 * @see HistoryItem.history
 */
@Serializable
data class Category(
    override var id: Int? = null,
    val name: String,
    val description: String,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis(),
    override var history: List<History>? = null
) : GenericItem, HistoryItem
