package com.weesnerdevelopment.shared.serialCabinet

/**
 * Item that is an electronic device of some kind.
 */
interface ElectronicItem {
    /**
     * The model number of the electronic device, if there is one.
     */
    val modelNumber: String?

    /**
     * The serial number of the electronic device, if there is one.
     */
    val serialNumber: String?
}
