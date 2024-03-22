package com.example.aplikasisederhanadicoding

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(android.R.style.Theme_DeviceDefault_DayNight)
        actionBar?.hide()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = ContextCompat.getColor(this, R.color.green_android)
            window.navigationBarColor = ContextCompat.getColor(this, R.color.white)
            window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR)
        }
        setContentView(R.layout.activity_splash_screen)

        window.decorView.postDelayed({
            startActivity(Intent(this@SplashScreen, MainActivity::class.java))
            finish()
        }, 2000)
    }
}