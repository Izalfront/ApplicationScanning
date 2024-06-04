package com.example.applicationscanning.coment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.applicationscanning.databinding.ActivityComentBinding
import com.example.applicationscanning.result.HasilActivity

class ComentActivity : AppCompatActivity() {
    private lateinit var binding : ActivityComentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            startActivity(Intent(this, HasilActivity::class.java))
        }
    }
}