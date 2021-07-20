package com.disabella.mylistcurrencies

data class PrivatApi(
    val date: String?,
    val bank: String?,
    val baseCurrency: Int?,
    val baseCurrencyLit: String?,
    val exchangeRate: List<ExchangeRate>?

)