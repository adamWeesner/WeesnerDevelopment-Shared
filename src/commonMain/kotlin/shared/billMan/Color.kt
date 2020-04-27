package shared.billMan

/**
 * The color to be shown to the user for specific items.
 *
 * @param red The red channel of the color.
 * @param green The green channel of the color.
 * @param blue The blue channel of the color.
 * @param alpha The alpha channel of the color.
 */
data class Color(
    var red: Int,
    var green: Int,
    var blue: Int,
    var alpha: Int
)