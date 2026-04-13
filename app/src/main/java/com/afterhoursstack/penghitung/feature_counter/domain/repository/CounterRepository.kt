package com.afterhoursstack.penghitung.feature_counter.domain.repository

import com.afterhoursstack.penghitung.feature_counter.domain.model.Counter

interface CounterRepository {
    suspend fun getCounter(): Counter
    suspend fun increment(): Counter
    suspend fun decrement(): Counter
}


