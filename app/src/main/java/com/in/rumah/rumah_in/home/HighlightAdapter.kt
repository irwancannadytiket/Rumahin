package com.`in`.rumah.rumah_in.home

import android.content.Context
import android.databinding.ViewDataBinding
import android.text.Html
import android.view.View
import com.`in`.rumah.rumah_in.BaseBindingAdapter
import com.`in`.rumah.rumah_in.R
import com.`in`.rumah.rumah_in.databinding.RowMenuHighlightBinding
import com.`in`.rumah.rumah_in.databinding.RowMenuHomeBinding
import com.`in`.rumah.rumah_in.model.HighlightResponse
import com.squareup.picasso.Picasso

class HighlightAdapter(val listImage: List<HighlightResponse.DataHighlight>,
                       val click: View.OnClickListener,
                       val context: Context) : BaseBindingAdapter() {

    override fun updateBinding(binding: ViewDataBinding, position: Int) {
        val objects: HighlightResponse.DataHighlight = listImage[position]
        val view : RowMenuHighlightBinding = binding as RowMenuHighlightBinding
        Picasso.with(context).load(objects.image_url).into(view.ivHouseHighlight)
        view.tvHighloghtTitle.text = objects.name
        view.tvHighloghtDesc.text = Html.fromHtml(objects.address)

    }

    override fun getLayoutResource(): Int {
        return R.layout.row_menu_highlight
    }

    override fun getOnClickListener(): View.OnClickListener {
        return click
    }

    override fun getItemCount(): Int {
        return listImage.size
    }
}