package com.weesnerdevelopment.shared

import kotlin.js.Date

actual fun currentTimeMillis() = Date.now().toLong()