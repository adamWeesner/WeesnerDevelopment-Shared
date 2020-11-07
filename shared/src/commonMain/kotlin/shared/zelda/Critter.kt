package shared.zelda

import shared.Parcelable
import shared.Parcelize
import shared.base.GenericItem

@Parcelize
data class Critter(
    override val id: Int?,
    val critter: String,
    val effectClass: String?,
    val boostEffect: String?,
    val durationIncrease: String?,
    override val dateCreated: Long,
    override val dateUpdated: Long
) : GenericItem, Parcelable
