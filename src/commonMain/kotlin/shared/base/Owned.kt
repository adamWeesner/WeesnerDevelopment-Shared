package shared.base

import shared.auth.User

/**
 * Base for owned items.
 */
interface Owned {
    /**
     * The [User] who's the owner of this item.
     */
    val owner: User
}
