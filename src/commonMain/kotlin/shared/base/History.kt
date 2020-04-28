package shared.base

import shared.auth.User
import shared.currentTimeMillis

/**
 * History for any given [GenericItem].
 *
 * @param field The name of the backend item field to be updated.
 * @param oldValue The current value of the field.
 * @param newValue The new value of the field.
 * @param updatedBy The [User] who made the update.
 * @param updatedAt The millis representation of the time that the item was updated.
 */
data class History(
    val field: String,
    val oldValue: Any?,
    val newValue: Any?,
    val updatedBy: User,
    val updatedAt: Long = currentTimeMillis()
)
