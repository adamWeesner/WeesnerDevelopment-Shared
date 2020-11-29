package shared.serialCabinet

import shared.Parcelable
import shared.Parcelize
import shared.base.GenericItem
import shared.base.History
import shared.base.HistoryItem
import shared.currentTimeMillis

/**
 * Category for Serial Cabinet items.
 *
 * @param name The name of the category.
 * @param description The description of the category.
 *
 * @see GenericItem.id
 * @see GenericItem.dateCreated
 * @see GenericItem.dateUpdated
 * @see HistoryItem.history
 */
@Parcelize
data class Category(
    override var id: Int? = null,
    val name: String,
    val description: String,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis(),
    override var history: List<History>? = null
) : GenericItem, HistoryItem, Parcelable
