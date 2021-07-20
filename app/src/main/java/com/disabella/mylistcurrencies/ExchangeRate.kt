package com.disabella.mylistcurrencies

data class ExchangeRate(
    val baseCurrency: String?,
    val currency: String?,
    val saleRateNB: Double?,
    val purchaseRateNB: Double?,
    val saleRate: Double?,
    val purchaseRate: Double?
)
