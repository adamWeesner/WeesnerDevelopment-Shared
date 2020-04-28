package shared.base

import shared.auth.User

/**
 * Base for owned items.
 */
interface OwnedItem {
    /**
     * The [User] who's the owner of this item.
     */
    val owner: User
}
