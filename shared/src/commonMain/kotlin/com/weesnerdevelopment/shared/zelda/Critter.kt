package com.weesnerdevelopment.shared.zelda

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericItem
import com.weesnerdevelopment.shared.currentTimeMillis

@Parcelize
data class Critter(
    override val id: Int? = null,
    val critter: String,
    val effectClass: String?,
    val boostEffect: String?,
    val durationIncrease: String?,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem, Parcelable
