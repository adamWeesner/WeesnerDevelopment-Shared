package shared.zelda

import shared.Parcelable
import shared.Parcelize
import shared.base.GenericItem

@Parcelize
data class MonsterPart(
    override val id: Int?,
    val part: String,
    val durationIncrease: String,
    override val dateCreated: Long,
    override val dateUpdated: Long
) : GenericItem, Parcelable
