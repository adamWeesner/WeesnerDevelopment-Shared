package com.weesnerdevelopment.shared.zelda

import com.weesnerdevelopment.shared.base.GenericItem
import com.weesnerdevelopment.shared.currentTimeMillis
import kotlinx.serialization.Serializable

@Serializable
data class Critter(
    override val id: Int? = null,
    val critter: String,
    val effectClass: String?,
    val boostEffect: String?,
    val durationIncrease: String?,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem
