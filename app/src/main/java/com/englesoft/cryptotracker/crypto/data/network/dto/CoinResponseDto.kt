package com.englesoft.cryptotracker.crypto.data.network.dto

import kotlinx.serialization.Serializable

@Serializable
data class CoinResponseDto(
    val data: List<CoinDto>,
)