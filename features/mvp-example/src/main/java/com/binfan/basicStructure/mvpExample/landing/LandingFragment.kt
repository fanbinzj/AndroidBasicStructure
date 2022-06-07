package com.binfan.basicStructure.mvpexample.landing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.binfan.basicStructure.mvpexample.databinding.FragmentLandingBinding

internal class LandingFragment : Fragment(), LandingContract.View {

    private val presenter = LandingPresenter()

    private lateinit var ui: FragmentLandingBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        ui = FragmentLandingBinding.inflate(inflater)

        ui.presenter = presenter

        ui.lifecycleOwner = this

        return ui.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.onViewAttached(this)
    }
}
