package shared.zelda

import shared.Parcelable
import shared.Parcelize
import shared.base.GenericItem

@Parcelize
data class Image(
    override val id: Int?,
    val description: String,
    val src: String,
    val width: Int,
    val height: Int,
    override val dateCreated: Long,
    override val dateUpdated: Long
) : GenericItem, Parcelable
