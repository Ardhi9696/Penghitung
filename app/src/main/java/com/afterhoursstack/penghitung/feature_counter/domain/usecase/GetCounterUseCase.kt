package com.afterhoursstack.penghitung.feature_counter.domain.usecase

import com.afterhoursstack.penghitung.feature_counter.domain.model.Counter
import com.afterhoursstack.penghitung.feature_counter.domain.repository.CounterRepository

class GetCounterUseCase(
    private val repository: CounterRepository
) {
    suspend operator fun invoke(): Counter {
        return repository.getCounter()
    }
}