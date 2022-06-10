package com.binfan.basicStructure.examples.appbar.ownedbyfragment

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.binfan.basicStructure.examples.R
import com.binfan.basicStructure.examples.databinding.FragmentAppbarOwnedByFragmentBinding

class AppbarExample2Fragment : Fragment() {

    private lateinit var ui: FragmentAppbarOwnedByFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setHasOptionsMenu(true)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        ui = FragmentAppbarOwnedByFragmentBinding.inflate(inflater)

        ui.fragmentToolBar.inflateMenu(R.menu.owned_by_activity_appbar_menu)
        ui.fragmentToolBar.setNavigationIcon(androidx.appcompat.R.drawable.abc_ic_ab_back_material)
        ui.fragmentToolBar.setNavigationOnClickListener {
            requireActivity().onBackPressed()
        }

        return ui.root
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> {
                true
            }
            R.id.action_done -> {
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}