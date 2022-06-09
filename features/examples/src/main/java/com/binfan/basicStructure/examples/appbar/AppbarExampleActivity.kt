package com.binfan.basicStructure.examples.appbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.binfan.basicStructure.examples.databinding.ActivityExampleAppbarBinding

class AppbarExampleActivity: AppCompatActivity() {

    private lateinit var binding: ActivityExampleAppbarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExampleAppbarBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}