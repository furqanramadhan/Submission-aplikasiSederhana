package com.example.aplikasisederhanadicoding

import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class About : AppCompatActivity(), View.OnClickListener {
    private lateinit var backNav : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(android.R.style.Theme_DeviceDefault_DayNight)
        actionBar?.hide()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = ContextCompat.getColor(this, R.color.green_android)
            window.navigationBarColor = ContextCompat.getColor(this, R.color.white)
            window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR)
        }

        setContentView(R.layout.activity_about)
        backNav = findViewById(R.id.backNav)
        backNav.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        if (p0?.id == R.id.backNav) {
            finish()
        }
    }
}