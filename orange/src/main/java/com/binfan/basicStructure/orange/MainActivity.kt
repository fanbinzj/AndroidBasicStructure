package com.binfan.basicStructure.orange

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.binfan.basicStructure.coffee.CoffeeActivity
import com.binfan.basicStructure.orange.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.clickButton.setOnClickListener {
            startActivity(Intent(this, CoffeeActivity::class.java))
        }
    }
}
