package com.example.viewbindingadapters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbindingadapters.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.isVisible = true
        binding.imageUri = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2d/Recep_Tayyip_Erdogan_in_Ukraine.jpg/330px-Recep_Tayyip_Erdogan_in_Ukraine.jpg"
    }
}