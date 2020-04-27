package shared.billMan

import shared.base.GenericItem
import shared.base.History
import shared.base.Owned
import shared.currentTimeMillis

/**
 * The payment that occurs when you have "paid" a bill in the app.
 *
 * @param amount the amount that is being paid.
 *
 * @see GenericItem.id
 * @see GenericItem.history
 * @see GenericItem.dateCreated
 * @see GenericItem.dateUpdated
 * @see Owned.ownerId
 */
data class Payment(
    override var id: Int? = null,
    override var ownerId: String,
    var amount: String,
    override var history: MutableList<History>? = null,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem, Owned
