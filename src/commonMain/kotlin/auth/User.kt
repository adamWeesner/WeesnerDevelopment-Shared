package auth

import base.GenericItem
import currentTimeMillis
import toJson

class User(
    override var id: Int? = null,
    val uuid: String? = null,
    val name: String?,
    val email: String?,
    val photoUrl: String? = null,
    var username: String? = null,
    var password: String? = null,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem {
    /**
     * [User] as a [HashedUser].
     */
    fun asHashed() = if (username != null && password != null) HashedUser(
        username!!,
        password!!
    ) else null

    /**
     * [User] with the sensitive fields set to null.
     */
    fun redacted() = User(
        name = name,
        email = email,
        username = username,
        dateCreated = dateCreated,
        dateUpdated = dateUpdated
    ).toJson()
}