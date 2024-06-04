package com.example.applicationscanning.result

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.applicationscanning.R
import com.example.applicationscanning.databinding.ActivityHasilBinding

class HasilActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHasilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHasilBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}