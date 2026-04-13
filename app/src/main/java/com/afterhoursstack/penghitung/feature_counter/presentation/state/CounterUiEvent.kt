package com.afterhoursstack.penghitung.feature_counter.presentation.state

sealed class CounterUiEvent {
    object OnIncrement : CounterUiEvent()
    object OnDecrement : CounterUiEvent()
}