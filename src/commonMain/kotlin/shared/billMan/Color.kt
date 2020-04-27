package shared.billMan

import shared.base.GenericItem
import shared.base.History
import shared.currentTimeMillis

/**
 * The color to be shown to the user for specific items.
 *
 * @param red The red channel of the color.
 * @param green The green channel of the color.
 * @param blue The blue channel of the color.
 * @param alpha The alpha channel of the color.
 */
data class Color(
    override var id: Int? = null,
    var red: Int,
    var green: Int,
    var blue: Int,
    var alpha: Int,
    override var history: MutableList<History>? = null,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem