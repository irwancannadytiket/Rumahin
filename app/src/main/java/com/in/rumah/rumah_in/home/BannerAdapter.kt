package com.`in`.rumah.rumah_in.home

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.`in`.rumah.rumah_in.R
import com.`in`.rumah.rumah_in.model.BannerResponse
import com.squareup.picasso.Picasso

class BannerAdapter(var banner: List<BannerResponse.DataBanner>, val context: Context) : PagerAdapter(){

    override fun getCount(): Int {
        return banner.size
    }

    fun setBanners(banners: List<BannerResponse.DataBanner>) {
        banner = banners
        notifyDataSetChanged()
    }

    override fun isViewFromObject(view: View?, `object`: Any?): Boolean {
        return view == `object`
    }
    override fun instantiateItem(container: ViewGroup?, position: Int): Any {
        val banner: BannerResponse.DataBanner = banner[position]
        val view = LayoutInflater.from(context).inflate(R.layout.row_banner,container,false)
        Picasso.with(context).load(banner.image_url).into(view.findViewById(R.id.iv_image_banner) as ImageView)
        container?.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup?, position: Int, `object`: Any?) {
        container?.removeView(`object` as View?)
    }

}