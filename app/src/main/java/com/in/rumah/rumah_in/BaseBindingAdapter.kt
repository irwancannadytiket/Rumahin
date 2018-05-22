package com.`in`.rumah.rumah_in

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class BaseBindingAdapter : RecyclerView.Adapter<BaseBindingViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseBindingViewHolder {
        return BaseBindingViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context),
                getLayoutResource(), parent, false), getOnClickListener())
    }

    override fun onBindViewHolder(holder: BaseBindingViewHolder, position: Int) {
        updateBinding(holder.binding, position)
    }

    protected abstract fun updateBinding(binding: ViewDataBinding, position: Int)

    protected abstract fun getLayoutResource(): Int

    protected abstract fun getOnClickListener(): View.OnClickListener
}