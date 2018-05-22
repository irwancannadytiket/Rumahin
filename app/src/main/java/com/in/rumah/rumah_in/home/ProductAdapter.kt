package com.`in`.rumah.rumah_in.home

import android.databinding.ViewDataBinding
import android.view.View
import com.`in`.rumah.rumah_in.BaseBindingAdapter
import com.`in`.rumah.rumah_in.R
import com.`in`.rumah.rumah_in.databinding.RowMenuHomeBinding
import com.`in`.rumah.rumah_in.model.ProductMenu

class ProductAdapter(private val productMenu: List<ProductMenu>,
                     val clickListener: View.OnClickListener) : BaseBindingAdapter() {

    override fun updateBinding(binding: ViewDataBinding, position: Int) {
        var productMenus : ProductMenu = productMenu[position]
        var rowMenu : RowMenuHomeBinding = binding as RowMenuHomeBinding
        rowMenu.ivContet.setImageResource(productMenus.drawableResource)
        rowMenu.tvTitle.text = productMenus.titleResource
    }

    override fun getLayoutResource(): Int {
        return R.layout.row_menu_home
    }

    override fun getOnClickListener(): View.OnClickListener {
        return clickListener
    }

    override fun getItemCount(): Int {
        return productMenu.size
    }
}