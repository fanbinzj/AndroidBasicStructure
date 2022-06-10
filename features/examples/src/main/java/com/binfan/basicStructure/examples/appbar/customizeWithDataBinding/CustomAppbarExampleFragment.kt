package com.binfan.basicStructure.examples.appbar.customizeWithDataBinding

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.binfan.basicStructure.examples.R
import com.binfan.basicStructure.examples.databinding.FragmentCustomAppBarWithIncludeDataBindingBinding

class CustomAppbarExampleFragment : Fragment() {

    private lateinit var ui: FragmentCustomAppBarWithIncludeDataBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setHasOptionsMenu(true)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        ui = FragmentCustomAppBarWithIncludeDataBindingBinding.inflate(inflater)

        ui.viewData = ViewData(
            toolbarViewData = ToolbarViewData(
                stepTitle = R.string.step_1_of_2_label,
                onToolbarLeftArrowClicked = ::closeCurrentScreen,
                onToolbarCloseButtonClicked = { requireActivity().onBackPressed() },
        ))

        return ui.root
    }

    private fun closeCurrentScreen() {
        requireActivity().onBackPressed()
    }
}