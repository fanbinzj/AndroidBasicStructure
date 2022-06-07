package com.binfan.basicStructure.mvpexample.landing

internal data class LandingViewData(
    var loadingVisible: Boolean = true,
    var contentVisible: Boolean = false,
    var errorVisible: Boolean = false,
    var heading: CharSequence = "",
    var subHeading: String = "",
)
