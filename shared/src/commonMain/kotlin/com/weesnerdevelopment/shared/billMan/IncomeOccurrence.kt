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
 * The occurrence for given [itemId]. This is what controls payments and when things are due.
 *
 * @param itemId the id of the [Bill] or [Income] that this occurrence is associated with.
 * @param dueDate the due date of this occurrence.
 * @param amountLeft how much is left for this occurrence, will get updated every time [payments]
 * gets updated.
 * @param amount total amount for this occurrence of the [itemId].
 * @param every how often the [itemId] will need to reoccur.
 * @param payments list of [Payment] made for the [itemId] for this occurrence.
 *
 * @see GenericItem.id
 * @see GenericItem.dateCreated
 * @see GenericItem.dateUpdated
 * @see OwnedItem.owner
 * @see HistoryItem.history
 */
@Parcelize
data class IncomeOccurrence(
    override var id: Int? = null,
    override val owner: User,
    val sharedUsers: List<User>? = null,
    val itemId: String,
    var dueDate: Long,
    var amountLeft: String,
    var amount: String,
    var every: String,
    var payments: List<Payment>? = null,
    override var history: List<History>? = null,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem, OwnedItem, HistoryItem, Parcelable
