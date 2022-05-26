package com.example.bootcamptoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bootcamptoolbar.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarThird)
    }

    override fun onStart() {
        super.onStart()
        setUpToolbar()
    }

    private fun setUpToolbar() {
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
        }
    }
}