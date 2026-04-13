package com.afterhoursstack.penghitung.feature_counter.presentation.component

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun CounterContent(
    count: Int,
    onIncrement: () -> Unit,
    onDecrement: () -> Unit
) {
    Column {
        Text(text = count.toString())
        Button(onClick = onIncrement) { Text("+") }
        Button(onClick = onDecrement) { Text("-") }
    }
}