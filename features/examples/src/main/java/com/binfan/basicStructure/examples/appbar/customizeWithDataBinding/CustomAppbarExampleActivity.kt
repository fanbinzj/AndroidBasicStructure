package com.binfan.basicStructure.examples.appbar.customizeWithDataBinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class CustomAppbarExampleActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        actionBar?.hide()

        supportFragmentManager.beginTransaction().replace(
            android.R.id.content, CustomAppbarExampleFragment()
        ).commit()
    }
}