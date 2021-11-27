package com.weesnerdevelopment.shared.zelda

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericItem
import com.weesnerdevelopment.shared.currentTimeMillis

@Parcelize
data class Effect(
    override val id: Int? = null,
    val name: String,
    val image: Image,
    val description: String,
    val timeLimit: String,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem, Parcelable
