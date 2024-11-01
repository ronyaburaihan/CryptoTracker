package com.englesoft.cryptotracker.crypto.domain

import com.englesoft.cryptotracker.core.domain.util.NetworkError
import com.englesoft.cryptotracker.core.domain.util.Result

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
}