package com.weesnerdevelopment.shared.billMan

import com.weesnerdevelopment.shared.auth.User
import com.weesnerdevelopment.shared.base.*
import com.weesnerdevelopment.shared.currentTimeMillis
import kotlinx.serialization.Serializable

/**
 * An income for the [User].
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
data class Income(
    override var id: Int? = null,
    override var uuid: String? = null,
    override val owner: String,
    override var name: String,
    override var amount: String,
    override var varyingAmount: Boolean = false,
    override var color: Color,
    override var history: List<History>? = null,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem, UuidItem, BaseBillManMoneyItem, OwnedItem, HistoryItem
