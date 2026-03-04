package com.mikitazayanchkouski.pexelskmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform