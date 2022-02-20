package com.weesnerdevelopment.shared.base

import com.weesnerdevelopment.shared.auth.User
import com.weesnerdevelopment.shared.currentTimeMillis
import kotlinx.serialization.Serializable

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
@Serializable
data class History(
    override val id: Int? = null,
    val field: String,
    val oldValue: String?,
    val newValue: String?,
    val updatedBy: User,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem
