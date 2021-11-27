package com.weesnerdevelopment.shared.zelda

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericItem
import com.weesnerdevelopment.shared.currentTimeMillis

@Parcelize
data class Image(
    override val id: Int? = null,
    val description: String,
    val src: String,
    val width: Int,
    val height: Int,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem, Parcelable
