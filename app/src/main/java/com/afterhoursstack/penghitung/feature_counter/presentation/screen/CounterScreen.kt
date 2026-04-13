package com.afterhoursstack.penghitung.feature_counter.presentation.screen

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.afterhoursstack.penghitung.feature_counter.presentation.CounterViewModel
import com.afterhoursstack.penghitung.feature_counter.presentation.component.CounterContent
import com.afterhoursstack.penghitung.feature_counter.presentation.state.CounterUiEvent

@Composable
fun CounterScreen(
    viewModel: CounterViewModel = viewModel()
) {
    val state = viewModel.state

    CounterContent(
        count = state.count,
        onIncrement = { viewModel.onEvent(CounterUiEvent.OnIncrement) },
        onDecrement = { viewModel.onEvent(CounterUiEvent.OnDecrement) }
    )
}