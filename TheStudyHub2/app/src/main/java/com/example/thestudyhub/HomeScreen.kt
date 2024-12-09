package com.example.thestudyhub

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val profile_navigation = findViewById<ImageView>(R.id.profile_navigation)
        profile_navigation.setOnClickListener {
            val intent = Intent(this, UserProfileScreen::class.java)
            startActivity(intent)
        }

        val resourcesIcon = findViewById<ImageView>(R.id.Resources_icon)
        resourcesIcon.setOnClickListener {
            val intent = Intent(this, ResourceScreen::class.java)
            startActivity(intent)
        }
    }
}
