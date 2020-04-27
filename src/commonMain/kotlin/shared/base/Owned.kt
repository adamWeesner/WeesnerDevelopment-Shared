package shared.base

/**
 * Base for owned items.
 */
interface Owned {
    /**
     * The id of the [User] who's the owner of this item.
     */
    val ownerId: String
}
