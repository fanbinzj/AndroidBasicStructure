package com.binfan.basicStructure.coffee.content

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.binfan.basicStructure.coffee.R
import com.binfan.basicStructure.coffee.databinding.FragmentContentBinding

class ContentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val ui: FragmentContentBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_content,
            container,
            false)
//        val ui = FragmentContentBinding.inflate(inflater)

        ui.viewStateBinding = ViewStateBinding()

        ui.lifecycleOwner = this

        return ui.root
    }
}
