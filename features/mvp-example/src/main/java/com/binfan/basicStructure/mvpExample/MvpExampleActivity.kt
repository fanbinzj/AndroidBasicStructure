package com.binfan.basicStructure.mvpexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.binfan.basicStructure.mvpexample.landing.LandingFragment

class MvpExampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.beginTransaction().replace(
            android.R.id.content, LandingFragment()
        ).commit()
    }
}
