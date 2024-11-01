package com.englesoft.cryptotracker.crypto.data.network

import com.englesoft.cryptotracker.core.data.network.constructURL
import com.englesoft.cryptotracker.core.data.network.safeCall
import com.englesoft.cryptotracker.core.domain.util.NetworkError
import com.englesoft.cryptotracker.core.domain.util.Result
import com.englesoft.cryptotracker.core.domain.util.map
import com.englesoft.cryptotracker.crypto.data.mapper.toCoin
import com.englesoft.cryptotracker.crypto.data.network.dto.CoinResponseDto
import com.englesoft.cryptotracker.crypto.domain.Coin
import com.englesoft.cryptotracker.crypto.domain.CoinDataSource
import io.ktor.client.HttpClient
import io.ktor.client.request.get

class RemoteCoinDataSource(
    private val httpClient: HttpClient
) : CoinDataSource {
    override suspend fun getCoins(): Result<List<Coin>, NetworkError> {
        return safeCall<CoinResponseDto> {
            httpClient.get(
                urlString = constructURL("/assets")
            )
        }.map { response ->
            response.data.map { it.toCoin() }
        }
    }
}