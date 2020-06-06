package shared.base

import shared.Parcelable
import shared.Parcelize
import shared.auth.User
import shared.currentTimeMillis

/**
 * History for any given [GenericItem].
 *
 * @param field The name of the backend item field to be updated.
 * @param oldValue The current value of the field.
 * @param newValue The new value of the field.
 * @param updatedBy The [User] who made the update.
 *
 * @see GenericItem.id
 * @see GenericItem.dateCreated
 * @see GenericItem.dateUpdated
 */
@Parcelize
data class History(
    override val id: Int? = null,
    val field: String,
    val oldValue: Any?,
    val newValue: Any?,
    val updatedBy: User,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem, Parcelable
