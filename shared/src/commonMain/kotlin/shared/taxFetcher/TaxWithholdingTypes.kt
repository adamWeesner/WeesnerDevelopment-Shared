package shared.taxFetcher

/**
 * Accepted tax withholding types.
 */
enum class TaxWithholdingTypes {
    /**
     * Used for 'general', most cases use this.
     */
    General,

    /**
     * Used for 'non resident', non-U.S. citizens.
     */
    NonResident
}
