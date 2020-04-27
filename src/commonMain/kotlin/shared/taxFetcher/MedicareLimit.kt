package shared.taxFetcher

import shared.base.GenericItem
import shared.base.History
import shared.currentTimeMillis

/**
 * Medicare limit item, this represents the limit for the given [maritalStatus] and [year].
 *
 * @param year The year given.
 * @param maritalStatus The [MaritalStatus].
 * @param amount The amount of the limit.
 *
 * @see GenericItem.id
 * @see GenericItem.history
 * @see GenericItem.dateCreated
 * @see GenericItem.dateUpdated
 */
data class MedicareLimit(
    override val id: Int? = null,
    val year: Int,
    val maritalStatus: MaritalStatus,
    val amount: Int,
    override var history: MutableList<History>? = null,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem
