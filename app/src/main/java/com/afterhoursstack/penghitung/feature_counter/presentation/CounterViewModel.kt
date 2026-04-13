package com.afterhoursstack.penghitung.feature_counter.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.afterhoursstack.penghitung.feature_counter.domain.usecase.DecrementUseCase
import com.afterhoursstack.penghitung.feature_counter.domain.usecase.GetCounterUseCase
import com.afterhoursstack.penghitung.feature_counter.domain.usecase.IncrementUseCase
import com.afterhoursstack.penghitung.feature_counter.presentation.state.CounterUiEvent
import com.afterhoursstack.penghitung.feature_counter.presentation.state.CounterUiState
import kotlinx.coroutines.launch

class CounterViewModel(
    private val incrementUseCase: IncrementUseCase,
    private val decrementUseCase: DecrementUseCase,
    private val getCounterUseCase: GetCounterUseCase
) : ViewModel() {

    var state by mutableStateOf(CounterUiState())
        private set

    init {
        loadCounter()
    }

    fun onEvent(event: CounterUiEvent) {
        when (event) {
            CounterUiEvent.OnIncrement -> increment()
            CounterUiEvent.OnDecrement -> decrement()
        }
    }

    private fun loadCounter() {
        viewModelScope.launch {
            val result = getCounterUseCase()
            state = state.copy(count = result.value)
        }
    }

    private fun increment() {
        viewModelScope.launch {
            val result = incrementUseCase()
            state = state.copy(count = result.value)
        }
    }

    private fun decrement() {
        viewModelScope.launch {
            val result = decrementUseCase()
            state = state.copy(count = result.value)
        }
    }
}