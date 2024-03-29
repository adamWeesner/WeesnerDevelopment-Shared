package com.weesnerdevelopment.shared.zelda

import com.weesnerdevelopment.shared.base.GenericItem
import com.weesnerdevelopment.shared.currentTimeMillis
import kotlinx.serialization.Serializable

@Serializable
data class Ingredient(
    override val id: Int? = null,
    val title: String,
    val subtitle: String?,
    val name: String,
    val image: Image,
    val hearts: List<Image>?,
    val effects: String?,
    val bonus: String?,
    val bonusAddOns: List<Image>?,
    val duration: List<String>?,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem
