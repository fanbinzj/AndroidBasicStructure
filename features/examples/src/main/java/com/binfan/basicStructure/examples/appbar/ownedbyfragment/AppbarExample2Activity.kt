package com.binfan.basicStructure.examples.appbar.ownedbyfragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class AppbarExample2Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.hide()

        supportFragmentManager.beginTransaction().replace(
            android.R.id.content, AppbarExample2Fragment()
        ).commit()
    }
}