package com.englesoft.cryptotracker.crypto.data.mapper

import com.englesoft.cryptotracker.crypto.data.network.dto.CoinDto
import com.englesoft.cryptotracker.crypto.domain.Coin

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        rank = rank,
        name = name,
        symbol = symbol,
        marketCapUsd = marketCapUsd,
        changePercent24Hr = changePercent24Hr,
        priceUsd = priceUsd
    )
}