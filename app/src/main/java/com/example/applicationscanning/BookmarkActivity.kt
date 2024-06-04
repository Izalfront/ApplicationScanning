package com.example.applicationscanning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.applicationscanning.databinding.ActivityBookmarkBinding

class BookmarkActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBookmarkBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookmarkBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_bookmark)
    }
}