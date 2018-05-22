package com.`in`.rumah.rumah_in

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.View

class BaseBindingViewHolder : RecyclerView.ViewHolder {

    var binding: ViewDataBinding
        internal set

    constructor(layoutBinding: ViewDataBinding) : super(layoutBinding.root) {
        binding = layoutBinding
        binding.root.tag = this
    }

    constructor(layoutBinding: ViewDataBinding, listener: View.OnClickListener?) : super(layoutBinding.root) {
        binding = layoutBinding
        binding.root.setOnClickListener(listener)
        binding.root.tag = this
    }
}