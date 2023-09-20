package com.example.backgroundmodetest

import android.os.Bundle
import com.iristick.sdk.display.IRIWindow

class MainWindow: IRIWindow() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_window)
    }
}