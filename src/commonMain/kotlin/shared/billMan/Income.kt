package shared.billMan

import shared.auth.User
import shared.base.GenericItem
import shared.base.History
import shared.base.HistoryItem
import shared.base.OwnedItem
import shared.currentTimeMillis

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
data class Income(
    override var id: Int? = null,
    override val owner: User,
    override var name: String,
    override var amount: String,
    override var varyingAmount: Boolean = false,
    override var color: Color,
    override var history: MutableList<History>? = null,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem, BaseBillManMoneyItem, OwnedItem, HistoryItem
