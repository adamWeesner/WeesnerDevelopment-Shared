package shared.taxFetcher

import shared.base.GenericItem
import shared.currentTimeMillis

/**
 * Medicare item, this represents the data to determine how much medicare tax will be taken for a given gross income
 * amount. Here is an example of how this data would be used:
 * ```kotlin
 *    val medicare = Medicare(/* medicare data */)
 *    val taxable = 100
 *    val maritalStatus = MaritalStatus.Single
 *    var taxAmount = taxable * medicare.percent
 *
 *    medicare.limits.firstOrNull { it.maritalStatus == maritalStatus }?.let {
 *        val additional = if(it.amount<= taxable) taxable * medicare.additionalPercent
 *        taxAmount += additional
 *    }
 *
 *    // the amount that is to be taken out for medicare tax
 *    println(taxAmount)
 * ```
 *
 * @param year The year given.
 * @param percent The percent of the taxable data to be taken.
 * @param additionalPercent The additional percent of taxable data to be taken, given the taxable amount is over the
 * limit for [limits] for the correct [MaritalStatus].
 * @param limits List of the [MedicareLimit].
 *
 * @see GenericItem.id
 * @see GenericItem.dateCreated
 * @see GenericItem.dateUpdated
 */
data class Medicare(
    override val id: Int? = null,
    val year: Int,
    val percent: Double,
    val additionalPercent: Double,
    val limits: List<MedicareLimit>,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem
