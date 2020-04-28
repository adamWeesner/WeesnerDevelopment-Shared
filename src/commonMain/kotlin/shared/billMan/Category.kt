package shared.billMan

import shared.auth.User
import shared.base.GenericItem
import shared.base.History
import shared.base.Owned
import shared.currentTimeMillis

/**
 * Category for a [Bill].
 *
 * @param name The name of the category.
 *
 * @see GenericItem.id
 * @see GenericItem.history
 * @see GenericItem.dateCreated
 * @see GenericItem.dateUpdated
 * @see Owned.owner
 */
data class Category(
    override var id: Int? = null,
    val owner: User? = null,
    val name: String,
    override var history: MutableList<History>? = null,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem