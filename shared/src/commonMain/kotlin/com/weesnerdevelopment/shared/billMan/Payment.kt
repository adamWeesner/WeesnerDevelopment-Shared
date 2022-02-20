package com.weesnerdevelopment.shared.billMan

import com.weesnerdevelopment.shared.base.*
import com.weesnerdevelopment.shared.currentTimeMillis
import kotlinx.serialization.Serializable

/**
 * The payment that occurs when you have "paid" a bill in the app.
 *
 * @param amount the amount that is being paid.
 *
 * @see GenericItem.id
 * @see GenericItem.dateCreated
 * @see GenericItem.dateUpdated
 * @see OwnedItem.owner
 * @see HistoryItem.history
 */
@Serializable
data class Payment(
    override var id: Int? = null,
    override var uuid: String? = null,
    override var owner: String,
    var amount: String,
    override var history: List<History>? = null,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem, UuidItem, OwnedItem, HistoryItem
