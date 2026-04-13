package com.afterhoursstack.penghitung.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.afterhoursstack.penghitung.feature_counter.presentation.screen.CounterScreen

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "counter"
    ) {
        composable("counter") {
            CounterScreen()
        }
    }
}