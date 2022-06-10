package com.binfan.basicStructure.examples.appbar.ownedbyactivity

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.binfan.basicStructure.examples.R
import com.binfan.basicStructure.examples.databinding.FragmentAppbarOwnedByActivityBinding

class AppbarExampleFragment : Fragment() {

    private lateinit var ui: FragmentAppbarOwnedByActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setHasOptionsMenu(true)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        ui = FragmentAppbarOwnedByActivityBinding.inflate(inflater)

        return ui.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.owned_by_activity_appbar_menu, menu)
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