package base

/**
 * Generic base for all backend items.
 */
interface GenericItem {
    val id: Int?
    val dateCreated: Long
    val dateUpdated: Long
}
