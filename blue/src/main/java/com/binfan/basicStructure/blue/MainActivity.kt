package com.binfan.basicStructure.blue

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.binfan.basicStructure.blue.databinding.ActivityMainBinding
import com.binfan.basicStructure.coffee.CoffeeActivity
import com.binfan.basicStructure.mvpexample.MvpExampleActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.clickButton.setOnClickListener {
            startActivity(Intent(this, CoffeeActivity::class.java))
        }

        binding.mvpButton.setOnClickListener {
            startActivity(Intent(this, MvpExampleActivity::class.java))
        }
    }
}
