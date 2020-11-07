package shared.zelda

import shared.Parcelable
import shared.Parcelize
import shared.base.GenericItem

@Parcelize
data class OtherFood(
    override val id: Int?,
    val name: String,
    val image: Image,
    val effect: List<Image>,
    val description: String,
    val ingredients: List<String>,
    val method: String,
    override val dateCreated: Long,
    override val dateUpdated: Long
) : GenericItem, Parcelable
