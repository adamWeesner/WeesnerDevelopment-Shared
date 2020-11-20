package shared.zelda

import shared.Parcelable
import shared.Parcelize
import shared.base.GenericItem
import shared.currentTimeMillis

@Parcelize
data class Ingredient(
    override val id: Int?,
    val title: String,
    val subtitle: String?,
    val name: String,
    val image: Image,
    val hearts: List<Image>,
    val effects: String?,
    val bonus: String?,
    val bonusAddOns: List<Image>?,
    val duration: List<String>?,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem, Parcelable
