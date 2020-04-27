package shared.taxFetcher

import shared.base.GenericItem
import shared.base.History
import shared.currentTimeMillis

/**
 * Federal income tax item, this represents the data to determine how much federal income tax will be taken for a given
 * gross income amount. Here is an example of how this data would be used:
 * ```kotlin
 *    val federalIncomeTax = FederalIncomeTax(/* federal income tax data */)
 *    val grossAmount = 100
 *    val taxable = grossAmount - federalIncomeTax.nonTaxable
 *
 *    // the formula to determine the federal income tax amount
 *    val formula = (taxable + federalIncomeTax.plus) * federalIncomeTax.percent
 * ```
 *
 * @param year The year given.
 * @param maritalStatus The [MaritalStatus], used to determine the [TaxWithholding] and allowance information.
 * @param payPeriod The [PayPeriod], used to determine the [TaxWithholding] and allowance information.
 * @param over The amount that a taxable amount cannot be over.
 * ```kotlin
 *    val given = 9
 *    val over = 12
 *
 *    println(given < over) // true
 * ```
 * @param notOver The amount that a taxable amount has to be less than or equal to.
 * ```kotlin
 *    val given = 13
 *    val notOver = 12
 *
 *    println(given <= over) // false
 * ```
 * @param plus The amount to be added to the taxable amount.
 * @param percent The percent of the taxable amount to be taken.
 * @param nonTaxable The amount that is not taxable by Federal Income Tax.
 *
 * @see GenericItem.id
 * @see GenericItem.history
 * @see GenericItem.dateCreated
 * @see GenericItem.dateUpdated
 */
data class FederalIncomeTax(
    override val id: Int? = null,
    val year: Int,
    val maritalStatus: MaritalStatus,
    val payPeriod: PayPeriod,
    val over: Double,
    val notOver: Double,
    val plus: Double,
    val percent: Double,
    val nonTaxable: Double,
    override var history: MutableList<History>? = null,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis()
) : GenericItem
