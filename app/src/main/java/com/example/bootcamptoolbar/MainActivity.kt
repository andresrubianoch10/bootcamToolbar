package com.example.bootcamptoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
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
            //hide()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        R.id.action_search -> {
            showToolbar("Search")
            true
        }
        R.id.action_settings -> {
            showToolbar("settings")
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }

    private fun showToolbar(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show()
    }
}