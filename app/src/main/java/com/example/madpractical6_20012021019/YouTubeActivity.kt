package com.example.madpractical6_20012021019

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.madpractical6_20012021019.databinding.ActivityMainBinding

class YouTubeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_you_tube)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.playbtn.setOnClickListener {
            Intent(this,MainActivity::class.java).apply { startActivity(this)                                                                                                                                                   t) }
        }
    }
}