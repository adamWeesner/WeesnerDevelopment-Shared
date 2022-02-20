package com.weesnerdevelopment.shared.billMan

import com.weesnerdevelopment.shared.base.GenericItem
import com.weesnerdevelopment.shared.base.History
import com.weesnerdevelopment.shared.base.HistoryItem
import com.weesnerdevelopment.shared.base.UuidItem
import com.weesnerdevelopment.shared.currentTimeMillis
import kotlinx.serialization.Serializable

/**
 * The color to be shown to the user for specific items.
 *
 * @param red The red channel of the color.
 * @param green The green channel of the color.
 * @param blue The blue channel of the color.
 * @param alpha The alpha channel of the color.
 *
 * @see GenericItem.id
 * @see GenericItem.dateCreated
 * @see GenericItem.dateUpdated
 * @see HistoryItem.history
 */
@Serializable
data class Color(
    override var id: Int? = null,
    override var uuid: String? = null,
    var red: Int,
    var green: Int,
    var blue: Int,
    var alpha: Int,
    override var history: List<History>? = null,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem, UuidItem, HistoryItem