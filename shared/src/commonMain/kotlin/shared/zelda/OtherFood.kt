package shared.zelda

import shared.Parcelable
import shared.Parcelize
import shared.base.GenericItem
import shared.currentTimeMillis

@Parcelize
data class OtherFood(
    override val id: Int? = null,
    val name: String,
    val image: Image,
    val effect: List<Image>,
    val description: String,
    val ingredients: List<String>,
    val method: String,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem, Parcelable
