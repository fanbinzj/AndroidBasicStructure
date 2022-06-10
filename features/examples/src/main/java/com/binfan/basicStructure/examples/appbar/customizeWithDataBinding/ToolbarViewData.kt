package com.binfan.basicStructure.examples.appbar.customizeWithDataBinding

internal data class ToolbarViewData(
    var stepTitle: Int,
    val onToolbarLeftArrowClicked: () -> Unit,
    val onToolbarCloseButtonClicked: () -> Unit,
)
