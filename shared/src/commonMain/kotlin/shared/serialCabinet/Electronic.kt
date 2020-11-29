package shared.serialCabinet

import shared.Parcelable
import shared.Parcelize
import shared.auth.User
import shared.base.GenericItem
import shared.base.History
import shared.base.HistoryItem
import shared.base.OwnedItem
import shared.currentTimeMillis

/**
 * Category for Serial Cabinet items.
 *
 * @see GenericItem.id
 * @see GenericItem.dateCreated
 * @see GenericItem.dateUpdated
 * @see CabinetItem.name
 * @see CabinetItem.description
 * @see CabinetItem.image
 * @see CabinetItem.categories
 * @see PurchasedItem.barcode
 * @see PurchasedItem.barcodeImage
 * @see PurchasedItem.manufacturer
 * @see PurchasedItem.manufactureDate
 * @see PurchasedItem.purchaseDate
 * @see ElectronicItem.modelNumber
 * @see ElectronicItem.serialNumber
 * @see OwnedItem.owner
 * @see HistoryItem.history
 */
@Parcelize
data class Electronic(
    override var id: Int? = null,
    override val name: String,
    override val description: String,
    override val image: ByteArray?,
    override val modelNumber: String?,
    override val serialNumber: String?,
    override val categories: List<Category>,
    override val barcode: String?,
    override val barcodeImage: ByteArray?,
    override val manufactureDate: Long?,
    override val manufacturer: Manufacturer?,
    override val purchaseDate: Long?,
    override val owner: User,
    override val dateCreated: Long = currentTimeMillis(),
    override val dateUpdated: Long = currentTimeMillis(),
    override var history: List<History>? = null
) : GenericItem, OwnedItem, CabinetItem, PurchasedItem, ElectronicItem, HistoryItem, Parcelable
