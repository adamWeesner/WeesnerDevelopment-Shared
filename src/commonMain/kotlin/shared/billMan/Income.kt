package shared.billMan

import shared.base.GenericItem
import shared.base.History
import shared.base.Owned
import shared.currentTimeMillis

/**
 * An income for the [User].
 *
 * @see GenericItem.id
 * @see GenericItem.history
 * @see GenericItem.dateCreated
 * @see GenericItem.dateUpdated
 * @see BaseBillManMoneyItem.name
 * @see BaseBillManMoneyItem.amount
 * @see BaseBillManMoneyItem.varyingAmount
 * @see BaseBillManMoneyItem.color
 * @see Owned.ownerId
 */
data class Income(
    override var id: Int? = null,
    override val ownerId: String,
    override var name: String,
    override var amount: String,
    override var varyingAmount: Boolean = false,
    override var color: Color,
    override var history: MutableList<History>? = null,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem, BaseBillManMoneyItem, Owned
