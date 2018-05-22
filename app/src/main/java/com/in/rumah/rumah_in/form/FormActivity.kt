package com.`in`.rumah.rumah_in.form

import android.app.Activity
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.`in`.rumah.rumah_in.R
import com.`in`.rumah.rumah_in.databinding.ActivityFormBinding

class FormActivity : AppCompatActivity() {

    lateinit var activityFormBinding: ActivityFormBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityFormBinding = DataBindingUtil.setContentView(this, R.layout.activity_form)

        setSupportActionBar(activityFormBinding.toolbar)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        activityFormBinding.toolbar.title = resources.getString(R.string.isi_form)
    }

    companion object {
        fun startToForm(activity: Activity){
            val intent = Intent(activity, FormActivity::class.java)
            activity.startActivity(intent)
        }
    }
}