package com.afterhoursstack.penghitung

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.afterhoursstack.penghitung.core.ui.MainScreen
import com.afterhoursstack.penghitung.ui.theme.PenghitungTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PenghitungTheme {
                MainScreen()
            }
        }
    }
}

}