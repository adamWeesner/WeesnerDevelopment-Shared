package com.weesnerdevelopment.shared.billMan

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.auth.User
import com.weesnerdevelopment.shared.base.GenericItem
import com.weesnerdevelopment.shared.base.History
import com.weesnerdevelopment.shared.base.HistoryItem
import com.weesnerdevelopment.shared.base.OwnedItem
import com.weesnerdevelopment.shared.currentTimeMillis

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
@Parcelize
data class Payment(
    override var id: Int? = null,
    override var owner: User,
    var amount: String,
    override var history: List<History>? = null,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem, OwnedItem, HistoryItem, Parcelable
