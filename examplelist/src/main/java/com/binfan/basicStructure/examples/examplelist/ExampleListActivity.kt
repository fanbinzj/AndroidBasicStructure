package com.binfan.basicStructure.examples.examplelist

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.binfan.basicStructure.examples.appbar.AppbarExampleActivity
import com.binfan.basicStructure.examples.examplelist.databinding.ActivityExampleListBinding

class ExampleListActivity: Activity() {

    private lateinit var binding: ActivityExampleListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExampleListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.appbarActivityButton.setOnClickListener {
            startActivity(Intent(this, AppbarExampleActivity::class.java))
        }
    }
}