package com.example.applicationscanning.edit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.applicationscanning.coment.ComentActivity
import com.example.applicationscanning.R
import com.example.applicationscanning.databinding.ActivityEditBinding

class EditActivity : AppCompatActivity() {
    private lateinit var binding : ActivityEditBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            startActivity(Intent(this, ComentActivity::class.java))
        }

        // Bottom bar navigation
        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_crop -> {

                    true
                }
                R.id.navigation_rotate -> {
                    true
                }
                R.id.navigation_flip -> {
                    true
                }
                R.id.navigation_contrast -> {
                    true
                }
                R.id.navigation_brightness -> {
                    true
                }
                else -> false
            }
        }
    }
}