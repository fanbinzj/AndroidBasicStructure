package com.binfan.basicStructure.mvpexample.landing

import com.binfan.basicStructure.databinding.MutableLiveField
import com.binfan.basicStructure.extensions.applySchedulers
import io.reactivex.rxjava3.core.Single
import java.util.concurrent.TimeUnit

internal class LandingPresenter {

    private lateinit var view: LandingContract.View

    val viewData = MutableLiveField(LandingViewData())

    fun onViewAttached(view: LandingContract.View) {
        this.view = view
        loadData()
    }

    private fun loadData() {
//        addDisposable(
        getMockData()
                .applySchedulers()
                .subscribe({
                    viewData.value = viewData.value.copy(
                        loadingVisible = false,
                        contentVisible = true,
                        heading = it,
                        subHeading = "$it, i am subheading",
                    )
                }, {
                })
//        )
    }

    private fun getMockData() = Single.just("Got a string from mock")
        .delay(2, TimeUnit.SECONDS)
}
