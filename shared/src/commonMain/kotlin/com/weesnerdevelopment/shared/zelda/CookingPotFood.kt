package com.weesnerdevelopment.shared.zelda

import com.weesnerdevelopment.shared.base.GenericItem
import com.weesnerdevelopment.shared.currentTimeMillis
import kotlinx.serialization.Serializable

@Serializable
data class CookingPotFood(
    override val id: Int? = null,
    val name: String,
    val image: Image,
    val description: String,
    val ingredients: List<String>,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem
