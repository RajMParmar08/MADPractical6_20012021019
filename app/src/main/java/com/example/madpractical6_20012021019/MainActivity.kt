package com.example.madpractical6_20012021019

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import com.example.madpractical6_20012021019.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mediaController=MediaController(this)
        val uri:Uri=Uri.parse("android.resources://"+packageName+"/"+R.raw.thestoryoflight)
        binding.video.setMediaController(mediaController)
        mediaController.setAnchorView(binding.video)
        binding.video.setVideoURI(uri)
        binding.video.requestFocus()
        binding.video.start()
    }
}