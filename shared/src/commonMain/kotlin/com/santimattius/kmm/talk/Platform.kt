package com.santimattius.kmm.talk

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform