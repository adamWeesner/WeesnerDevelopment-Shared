package shared.serialCabinet

/**
 * Item base for Serial Cabinet items.
 */
interface CabinetItem {
    /**
     * The name of the item.
     */
    val name: String

    /**
     * Description of the item.
     */
    val description: String

    /**
     * Image of the item, if there is one.
     */
    val image: ByteArray?

    /**
     * The list of [Category]s of the item.
     */
    val categories: List<Category>
}
