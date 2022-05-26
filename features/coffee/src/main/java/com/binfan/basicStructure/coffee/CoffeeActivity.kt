package com.binfan.basicStructure.coffee

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.binfan.basicStructure.coffee.content.ContentActivity
import com.binfan.basicStructure.coffee.databinding.ActivityCoffeeBinding
import com.binfan.basicStructure.utility.Utils
import com.binfan.basicStructure.utility.R

class CoffeeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCoffeeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCoffeeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.convertButton.setOnClickListener {
            binding.dateText.text = getConvertedString()
        }

        binding.versionButton.setOnClickListener {
            binding.dateText.text = Utils.convertDateToShort("19-05-2022")
        }

        binding.mvvmButton.setOnClickListener {
            startActivity(Intent(this, ContentActivity::class.java))
        }
    }

    private fun getConvertedString(): String {
        return if (packageManager.getActivityInfo(componentName, 0).themeResource == R.style.MyTheme_Blue) {
            Utils.convertDate(binding.dateText.text.toString())
        } else {
            Utils.convertDateToShort(binding.dateText.text.toString())
        }
    }
}
