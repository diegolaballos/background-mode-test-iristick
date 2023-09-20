package com.example.backgroundmodetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.example.backgroundmodetest.ui.theme.BackgroundModeTestTheme
import com.iristick.sdk.IristickSDK

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BackgroundModeTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Text("Hi I'm testing the background mode")
                }
            }
        }

        // Adding null to the lifecycle so the window does not close when the activity is paused
        // background mode should keep showing the window
        IristickSDK.addWindow(null) { MainWindow() }

        // Request a background lock so glasses keep working while app is inactive. Do not care about
        // releasing the lock
        IristickSDK.acquireBackgroundLock()
    }
}