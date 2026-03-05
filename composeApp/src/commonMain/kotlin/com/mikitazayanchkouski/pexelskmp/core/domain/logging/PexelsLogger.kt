package com.mikitazayanchkouski.pexelskmp.core.domain.logging

interface PexelsLogger {
    fun debug(message: String)
    fun error(message: String, throwable: Throwable? = null)
    fun info(message: String)
    fun warning(message: String)
}