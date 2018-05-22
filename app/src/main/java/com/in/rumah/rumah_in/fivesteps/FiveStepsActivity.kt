package com.`in`.rumah.rumah_in.fivesteps

import android.app.Activity
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.`in`.rumah.rumah_in.R
import com.`in`.rumah.rumah_in.databinding.ActivityFiveStepsBinding

class FiveStepsActivity: AppCompatActivity(){

    lateinit var fiveStepsBinding: ActivityFiveStepsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fiveStepsBinding = DataBindingUtil.setContentView(this, R.layout.activity_five_steps)

        setSupportActionBar(fiveStepsBinding.toolbar)
        supportActionBar?.setDisplayShowHomeEnabled(true)
    }

    companion object {
        fun startToForm(activity: Activity){
            val intent = Intent(activity, FiveStepsActivity::class.java)
            activity.startActivity(intent)
        }
    }
}