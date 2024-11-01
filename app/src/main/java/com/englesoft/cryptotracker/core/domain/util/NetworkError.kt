package com.englesoft.cryptotracker.core.domain.util

enum class NetworkError: Error {
    REQUEST_TIMEOUT,
    TO_MANY_REQUEST,
    NO_INTERNET,
    SERVER_ERROR,
    SERIALIZATION_ERROR,
    UNKNOWN_ERROR
}