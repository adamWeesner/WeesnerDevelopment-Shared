package com.weesnerdevelopment.shared

actual interface Parcelable

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.BINARY)
actual annotation class Parcelize actual constructor()

@Target(AnnotationTarget.TYPE)
@Retention(AnnotationRetention.BINARY)
actual annotation class RawValue actual constructor()