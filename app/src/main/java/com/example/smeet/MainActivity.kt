package com.example.smeet

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val EducationButton = findViewById<Button>(R.id.buttonEducation)
        val SkillsButton = findViewById<Button>(R.id.buttonSkills)
        val AchievementsButton = findViewById<Button>(R.id.btnAchievements)
        val contactButton = findViewById<Button>(R.id.btnContact)

        EducationButton.setOnClickListener {
            //info about my education
            intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }

        SkillsButton.setOnClickListener {
            //info about my skills
            intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }

        AchievementsButton.setOnClickListener {
            //info about my projects
    }


        contactButton.setOnClickListener {
             //info about my contact
            intent = Intent(this, ContactActivity::class.java)
            startActivity(intent)
        }
    }
}