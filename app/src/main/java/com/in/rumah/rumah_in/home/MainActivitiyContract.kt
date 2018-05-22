package com.`in`.rumah.rumah_in.home

import com.`in`.rumah.rumah_in.model.BannerResponse
import com.`in`.rumah.rumah_in.model.HighlightResponse
import com.`in`.rumah.rumah_in.model.ProductMenu
import com.irwan.cannadys.kudotest.BasePresenter
import com.irwan.cannadys.kudotest.BaseView

interface MainActivitiyContract {

    interface View : BaseView<Presenter> {
        fun showBanner(banner: List<BannerResponse.DataBanner>)
        fun showHighlight(highlight: List<HighlightResponse.DataHighlight>)
    }

    interface Presenter : BasePresenter<View>{
        fun initProductMenu() : List<ProductMenu>
        fun getBanner()
        fun getHighlightHouse()
    }
}