package com.afterhoursstack.penghitung.feature_counter.presentation.state

data class CounterUiState(
    val count: Int = 0,
    val isLoading: Boolean = false
)