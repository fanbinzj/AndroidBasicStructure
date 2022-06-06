package com.binfan.basicStructure.databinding

import androidx.databinding.BindingAdapter
import android.view.View

object BindingAdapters {
    /**
     * Allows UI to bind to a boolean value to indicate visibility.
     *
     * Example:
     *
     * <View
     *    ...
     *    app:isVisible="@{viewModel.someLiveBooleanProperty}"
     *    />
     */
    @JvmStatic @BindingAdapter("isVisible")
    fun isVisible(view: View, show: Boolean) {
        view.visibility = if (show) View.VISIBLE else View.GONE
    }
}
