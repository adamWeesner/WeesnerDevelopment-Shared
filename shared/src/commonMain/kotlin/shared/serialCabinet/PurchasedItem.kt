package shared.serialCabinet

/**
 * Item that has been purchased.
 */
interface PurchasedItem {
    /**
     * The barcode of the item.
     */
    val barcode: String?

    /**
     * The Blob data of the image of the barcode.
     */
    val barcodeImage: ByteArray?

    /**
     * The date in which the item was manufactured, if there is one.
     */
    val manufactureDate: Long?

    /**
     * The [Manufacturer] of the item.
     */
    val manufacturer: Manufacturer?

    /**
     * The date in which the item was purchased.
     */
    val purchaseDate: Long?
}
