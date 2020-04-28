package shared.base

/**
 * Item that has history for it, most things should probably have history for them.
 */
interface HistoryItem {
    /**
     * List of [History], to keep track of when things get updated.
     */
    var history: List<History>?
}