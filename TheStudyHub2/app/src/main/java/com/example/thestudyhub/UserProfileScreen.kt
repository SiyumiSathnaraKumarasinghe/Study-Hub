package com.example.thestudyhub

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UserProfileScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_profile_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val goals = findViewById<Button>(R.id.goals)
        goals.setOnClickListener{
            val intent = Intent (this, MyGoalsScreen::class.java )
            startActivity(intent)
        }

        val Resources_icon = findViewById<ImageView>(R.id.Resources_icon)
        Resources_icon.setOnClickListener {
            val intent = Intent(this, ResourceScreen::class.java)
            startActivity(intent)
        }

        val home_icon = findViewById<ImageView>(R.id.home_icon)
        home_icon.setOnClickListener {
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }

        val logout_button = findViewById<Button>(R.id.logout_button)
        logout_button.setOnClickListener{
            val intent = Intent (this, LogOutScreen::class.java )
            startActivity(intent)
        }
    }
}