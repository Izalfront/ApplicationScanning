package com.example.applicationscanning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.applicationscanning.databinding.ActivityComentBinding

class ComentActivity : AppCompatActivity() {
    private lateinit var binding : ActivityComentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComentBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}