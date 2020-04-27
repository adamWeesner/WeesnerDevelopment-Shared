package shared.billMan

import shared.base.GenericItem
import shared.base.History
import shared.base.Owned
import shared.currentTimeMillis

/**
 * The bill.
 *
 * @param payoffAmount The amount to pay off the bill, if there is one.
 * @param sharedUsers List of [User]s that this bill can be seen by.
 * @param categories List of [Category]s that the bill references.
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
data class Bill(
    override var id: Int? = null,
    override val ownerId: String,
    override var name: String,
    override var amount: String,
    override var varyingAmount: Boolean = false,
    var payoffAmount: String? = null,
    var sharedUsers: List<String>? = null,
    var categories: List<String>,
    override var color: Color,
    override var history: MutableList<History>? = null,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem, BaseBillManMoneyItem, Owned
