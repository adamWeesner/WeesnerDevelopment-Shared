package com.weesnerdevelopment.shared

sealed class UrlType(val value: String, val url: String)

class Testing(url: String = "http://localhost") : UrlType("testing", url)
class Dev(url: String = "http://10.0.2.2") : UrlType("development", url)
object Prod : UrlType("production", "http://api.weesnerdevelopment.com")
