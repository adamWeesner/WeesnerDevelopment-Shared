package com.weesnerdevelopment.shared.billMan

import com.weesnerdevelopment.shared.auth.User
import com.weesnerdevelopment.shared.base.*
import com.weesnerdevelopment.shared.currentTimeMillis
import kotlinx.serialization.Serializable

/**
 * The bill.
 *
 * @param payoffAmount The amount to pay off the bill, if there is one.
 * @param sharedUsers List of [User]s that this bill can be seen by, this includes the [owner].
 * @param categories List of [Category]s that the bill references.
 *
 * @see GenericItem.id
 * @see GenericItem.dateCreated
 * @see GenericItem.dateUpdated
 * @see BaseBillManMoneyItem.name
 * @see BaseBillManMoneyItem.amount
 * @see BaseBillManMoneyItem.varyingAmount
 * @see BaseBillManMoneyItem.color
 * @see OwnedItem.owner
 * @see HistoryItem.history
 */
@Serializable
data class Bill(
    override var id: Int? = null,
    override var uuid: String? = null,
    override val owner: String,
    override var name: String,
    override var amount: String,
    override var varyingAmount: Boolean = false,
    var payoffAmount: String? = null,
    var sharedUsers: List<String> = listOf(owner),
    var categories: List<Category>,
    override var color: Color,
    override var history: List<History>? = null,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem, UuidItem, BaseBillManMoneyItem, OwnedItem, HistoryItem
