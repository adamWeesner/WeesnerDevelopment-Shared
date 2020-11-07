package shared.zelda

import shared.Parcelable
import shared.Parcelize
import shared.base.GenericItem

@Parcelize
data class FrozenFood(
    override val id: Int?,
    val name: String,
    val image: Image,
    val effect: List<Image>,
    val description: String,
    val ingredients: List<String>,
    override val dateCreated: Long,
    override val dateUpdated: Long
) : GenericItem, Parcelable
