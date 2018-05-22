package com.`in`.rumah.rumah_in.home

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.view.View
import com.`in`.rumah.rumah_in.R
import com.`in`.rumah.rumah_in.commons.GridSpacingItemDecoration
import com.`in`.rumah.rumah_in.commons.Injection
import com.`in`.rumah.rumah_in.databinding.ActivityMainBinding
import com.`in`.rumah.rumah_in.model.BannerResponse
import com.`in`.rumah.rumah_in.model.HighlightResponse

class MainActivity : AppCompatActivity() , MainActivitiyContract.View{

    private lateinit var mBinding : ActivityMainBinding
    private lateinit var presenter: MainActivitiyContract.Presenter
    private lateinit var bannerAdapter: BannerAdapter
    private lateinit var highlightAdapter: HighlightAdapter;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        presenter = initPresenter()
        presenter.bind(this)
        presenter.getBanner()
        presenter.getHighlightHouse()
        showProductMenu()
    }

    override fun initPresenter(): MainActivitiyContract.Presenter {
        return MainActivityPresenter(Injection.provideCoreAppRepository(applicationContext),
                Injection.provideSchedulerProvider())
    }

    private fun showProductMenu() {
        mBinding.rvContentProduct.layoutManager = GridLayoutManager(this, 2)
        val spacing = resources.getDimensionPixelSize(R.dimen.spacing_content)
        mBinding.rvContentProduct.addItemDecoration(GridSpacingItemDecoration(2,
                spacing, false))
        val productMenu = presenter.initProductMenu()
        mBinding.rvContentProduct.adapter = ProductAdapter(productMenu, HomeProductMenuClickListener(this, productMenu))
    }

    override fun showBanner(banner: List<BannerResponse.DataBanner>) {
        bannerAdapter = BannerAdapter(banner, this@MainActivity)
        bannerAdapter.setBanners(banner)
        mBinding.vpContentHome.adapter = bannerAdapter

    }

    override fun showHighlight(highlight: List<HighlightResponse.DataHighlight>) {
        mBinding.rvContentHighlight.layoutManager = GridLayoutManager(this, 2)
        mBinding.rvContentHighlight.setHasFixedSize(true)
        val spacing = resources.getDimensionPixelSize(R.dimen.spacing_content)
        mBinding.rvContentHighlight.addItemDecoration(GridSpacingItemDecoration(2,
                spacing, false))
        highlightAdapter = HighlightAdapter(highlight, View.OnClickListener {

        }, this)
        mBinding.rvContentHighlight.adapter = highlightAdapter
    }
}
