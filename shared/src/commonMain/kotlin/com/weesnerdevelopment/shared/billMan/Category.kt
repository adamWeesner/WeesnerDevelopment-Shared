package com.weesnerdevelopment.shared.billMan

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.auth.User
import com.weesnerdevelopment.shared.base.GenericItem
import com.weesnerdevelopment.shared.base.History
import com.weesnerdevelopment.shared.base.HistoryItem
import com.weesnerdevelopment.shared.currentTimeMillis

/**
 * Category for a [Bill].
 *
 * @param name The name of the category.
 * @param owner The [User] that owns the category, if there is one.
 *
 * @see GenericItem.id
 * @see GenericItem.dateCreated
 * @see GenericItem.dateUpdated
 * @see HistoryItem.history
 */
@Parcelize
data class Category(
    override var id: Int? = null,
    val owner: User? = null,
    val name: String,
    override var history: List<History>? = null,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem, HistoryItem, Parcelable
