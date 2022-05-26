package com.example.bootcamptoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bootcamptoolbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarMain)
    }

    override fun onStart() {
        super.onStart()
        setTitle()
    }

    private fun setTitle() {
        supportActionBar?.apply {
            title = "Bootcamp Android"
            subtitle = "Mayo 26"
        }
    }
}