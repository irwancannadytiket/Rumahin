package com.`in`.rumah.rumah_in.search

import android.app.Activity
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.`in`.rumah.rumah_in.R
import com.`in`.rumah.rumah_in.databinding.ActivitySearchHomeBinding
import com.`in`.rumah.rumah_in.form.FormActivity

class SearchHomeActivity : AppCompatActivity() {

    private lateinit var activitySearchHomeBinding: ActivitySearchHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activitySearchHomeBinding = DataBindingUtil.setContentView(this, R.layout.activity_search_home)

        setSupportActionBar(activitySearchHomeBinding.toolbar)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        activitySearchHomeBinding.toolbar.title = resources.getString(R.string.cari_rumah)
    }

    companion object {
        fun startToForm(activity: Activity){
            val intent = Intent(activity, SearchHomeActivity::class.java)
            activity.startActivity(intent)
        }
    }
}