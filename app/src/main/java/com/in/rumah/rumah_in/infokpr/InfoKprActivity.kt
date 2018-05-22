package com.`in`.rumah.rumah_in.infokpr

import android.app.Activity
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.`in`.rumah.rumah_in.R
import com.`in`.rumah.rumah_in.databinding.ActivityInfoKprBinding
import com.`in`.rumah.rumah_in.form.FormActivity

class InfoKprActivity : AppCompatActivity() {

    private lateinit var infoKprBinding: ActivityInfoKprBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        infoKprBinding = DataBindingUtil.setContentView(this,R.layout.activity_info_kpr)

        setSupportActionBar(infoKprBinding.toolbar)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        infoKprBinding.toolbar.title = resources.getString(R.string.info_kpr)
    }

    companion object {
        fun startToForm(activity: Activity){
            val intent = Intent(activity, InfoKprActivity::class.java)
            activity.startActivity(intent)
        }
    }
}