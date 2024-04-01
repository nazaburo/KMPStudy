package com.github.nazaburo.kmpstudy

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform