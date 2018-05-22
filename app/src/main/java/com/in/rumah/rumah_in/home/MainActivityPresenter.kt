package com.`in`.rumah.rumah_in.home

import com.`in`.rumah.rumah_in.R
import com.`in`.rumah.rumah_in.commons.BaseSchedulerProvider
import com.`in`.rumah.rumah_in.commons.CoreAppRepository
import com.`in`.rumah.rumah_in.model.BannerResponse
import com.`in`.rumah.rumah_in.model.HighlightResponse
import com.`in`.rumah.rumah_in.model.ProductMenu
import rx.Subscriber
import java.util.ArrayList

class MainActivityPresenter(private val coreAppRepository: CoreAppRepository,
                            private val baseSchedulerProvider: BaseSchedulerProvider) : MainActivitiyContract.Presenter {

    private var views: MainActivitiyContract.View? = null

    override fun bind(view: MainActivitiyContract.View) {
        views = view
    }

    override fun unbind() {
        views = null
    }

    override fun initProductMenu(): List<ProductMenu> {
        val productMenus = ArrayList<ProductMenu>()
        productMenus.add(ProductMenu("CARI RUMAH", ProductMenu.CARI_RUMAH,
                R.drawable.layer_4))
        productMenus.add(ProductMenu("INFO KPR TWP", ProductMenu.INFO_KPR,
                R.drawable.layer_5))
        productMenus.add(ProductMenu("5 LANGKAH", ProductMenu.FIVE_STEP,
                R.drawable.layer_8))
        productMenus.add(ProductMenu("ISI FORM", ProductMenu.ISI_FORM,
                R.drawable.layer_10))
        return productMenus
    }

    override fun getBanner() {
        coreAppRepository.banner
                .subscribeOn(baseSchedulerProvider.io())
                .observeOn(baseSchedulerProvider.ui())
                .subscribe(object : Subscriber<List<BannerResponse.DataBanner>>() {

                    override fun onCompleted() {
                    }

                    override fun onError(e: Throwable?) {
                    }

                    override fun onNext(t: List<BannerResponse.DataBanner>) {
                        if (views != null) {
                            views?.showBanner(t)
                        }
                    }
                })
    }

    //TODO : Change Model
    override fun getHighlightHouse() {
        coreAppRepository.highLight
                .subscribeOn(baseSchedulerProvider.io())
                .observeOn(baseSchedulerProvider.ui())
                .subscribe(object : Subscriber<List<HighlightResponse.DataHighlight>>(){

                    override fun onCompleted() {
                    }

                    override fun onError(e: Throwable?) {
                    }

                    override fun onNext(t: List<HighlightResponse.DataHighlight>) {
                        if (views != null){
                            views?.showHighlight(t)
                        }
                    }

                })
    }
}