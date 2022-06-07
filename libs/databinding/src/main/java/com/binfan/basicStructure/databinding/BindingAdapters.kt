package com.binfan.basicStructure.databinding

import android.view.View
import androidx.databinding.BindingAdapter

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
