package com.binfan.basicStructure.examples.examplelist

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.binfan.basicStructure.examples.appbar.customizeWithDataBinding.CustomAppbarExampleActivity
import com.binfan.basicStructure.examples.appbar.ownedbyactivity.AppbarExampleActivity
import com.binfan.basicStructure.examples.appbar.ownedbyfragment.AppbarExample2Activity
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

        binding.appbarActivity2Button.setOnClickListener {
            startActivity(Intent(this, AppbarExample2Activity::class.java))
        }

        binding.customizedAppbarActivityButton.setOnClickListener {
            startActivity(Intent(this, CustomAppbarExampleActivity::class.java))
        }
    }
}