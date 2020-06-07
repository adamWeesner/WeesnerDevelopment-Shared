package shared.taxFetcher

/**
 * The accepted pay periods.
 */
enum class PayPeriod {
    /**
     * Used for 'weekly', every week or 7 days.
     */
    Weekly,

    /**
     * Used for 'biweekly', every two weeks or 14 days.
     */
    Biweekly,

    /**
     * Used for 'semimonthly', twice a month; {monthLength} / 2, usually 15 days.
     */
    Semimonthly,

    /**
     * Used for 'monthly', once a month.
     */
    Monthly,

    /**
     * Used for 'quarterly', every 3 months.
     */
    Quarterly,

    /**
     * Used for 'semiannual', twice a year so {yearLength} / 2.
     */
    Semiannual,

    /**
     * Used for 'annual', 365 days or 366 depending on leap year.
     */
    Annual,

    /**
     * Used for 'daily'.
     */
    Daily
}
