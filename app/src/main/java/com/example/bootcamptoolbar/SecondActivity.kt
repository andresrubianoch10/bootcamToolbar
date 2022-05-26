package com.example.bootcamptoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bootcamptoolbar.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarSecondary)
    }

    override fun onStart() {
        super.onStart()
        supportActionBar?.apply {
            title = "Second Activity"
            setDisplayHomeAsUpEnabled(true)
        }
    }
}