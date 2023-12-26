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

        binding.isVisible = false
        binding.imageUrl = "https://www.freepik.com/free-photo/wide-angle-shot-single-tree-growing-clouded-sky-during-sunset-surrounded-by-grass_11342065.htm#query=nature&position=0&from_view=keyword&track=sph&uuid=bff1d68c-917f-4fae-9d3d-bd9e746287e2"
    }
}