package com.afterhoursstack.penghitung.feature_counter.data.repository

import com.afterhoursstack.penghitung.feature_counter.data.local.CounterLocalDataSource
import com.afterhoursstack.penghitung.feature_counter.domain.model.Counter
import com.afterhoursstack.penghitung.feature_counter.domain.repository.CounterRepository

class CounterRepositoryImpl(
    private val localDataSource: CounterLocalDataSource
) : CounterRepository {

    override suspend fun getCounter(): Counter {
        return Counter(localDataSource.get())
    }

    override suspend fun increment(): Counter {
        val newValue = localDataSource.increment()
        return Counter(newValue)
    }

    override suspend fun decrement(): Counter {
        val newValue = localDataSource.decrement()
        return Counter(newValue)
    }
}