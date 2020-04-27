package shared.billMan

/**
 * Base for Bill Man money items.
 */
interface BaseBillManMoneyItem {
    /**
     * The name of the money item.
     */
    var name: String

    /**
     * The amount of the money item.
     */
    var amount: String

    /**
     * Whether the [amount] varies or not.
     */
    var varyingAmount: Boolean

    /**
     * The color of the money item.
     */
    var color: Color
}
