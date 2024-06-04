package com.example.applicationscanning.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.applicationscanning.ComentActivity
import com.example.applicationscanning.R
import com.example.applicationscanning.databinding.ActivityBookmarkBinding
import com.example.applicationscanning.databinding.ActivityMainBinding
import com.example.applicationscanning.edit.EditActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnPaste.setOnClickListener {
            startActivity(Intent(this, ComentActivity::class.java))
        }

        binding.btnScreenShoot.setOnClickListener {
            startActivity(Intent(this, EditActivity::class.java))
        }

        binding.btnBookmark.setOnClickListener{
            startActivity(Intent(this, ActivityBookmarkBinding::class.java))
        }
    }
}