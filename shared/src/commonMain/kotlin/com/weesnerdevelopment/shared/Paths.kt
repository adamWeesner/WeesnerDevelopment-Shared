package com.weesnerdevelopment.shared

sealed class Paths {
    object User : Paths() {
        private const val version = "v1"
        const val basePath = "$version/"
        const val health = "${basePath}health"
        const val account = "${basePath}account"
        const val login = "${basePath}login"
        const val info = "${basePath}info"
        const val signUp = "${basePath}signUp"
        const val logging = "${basePath}logging"
    }

    object BillMan : Paths() {
        private const val version = "v1"
        const val basePath = "$version/"
        const val health = "${basePath}health"
        const val bills = "${basePath}bills"
        const val categories = "${basePath}categories"
        const val income = "${basePath}income"
        const val billOccurrences = "$bills/occurrences"
        const val incomeOccurrences = "$income/occurrences"
        const val logging = "${basePath}logging"
    }
}
