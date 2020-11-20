package shared.zelda

import shared.Parcelable
import shared.Parcelize
import shared.base.GenericItem
import shared.currentTimeMillis

@Parcelize
data class Critter(
    override val id: Int?,
    val critter: String,
    val effectClass: String?,
    val boostEffect: String?,
    val durationIncrease: String?,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem, Parcelable
