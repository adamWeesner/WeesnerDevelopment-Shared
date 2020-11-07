package shared.zelda

import shared.Parcelable
import shared.Parcelize
import shared.base.GenericItem

@Parcelize
data class Effect(
    override val id: Int?,
    val name: String,
    val image: Image,
    val description: String,
    val timeLimit: String,
    override val dateCreated: Long,
    override val dateUpdated: Long
) : GenericItem, Parcelable
