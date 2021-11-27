package com.weesnerdevelopment.shared.zelda

import com.weesnerdevelopment.shared.Parcelable
import com.weesnerdevelopment.shared.Parcelize
import com.weesnerdevelopment.shared.base.GenericItem
import com.weesnerdevelopment.shared.currentTimeMillis

@Parcelize
data class Elixir(
    override val id: Int? = null,
    val name: String,
    val image: Image,
    val effect: String,
    val description: String,
    val ingredients: List<String>,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem, Parcelable
