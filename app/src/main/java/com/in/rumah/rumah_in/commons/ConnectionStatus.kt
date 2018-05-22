package com.`in`.rumah.rumah_in.commons

import android.annotation.SuppressLint
import android.content.Context
import android.net.ConnectivityManager


/**
 * Created by irwancannady on 4/19/18.
 */
class ConnectionStatus {

    companion object {
        @JvmStatic
        fun hasNetwork(context: Context): Boolean {
            val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val networkInfo = cm.activeNetworkInfo
            return networkInfo != null && networkInfo.isConnected
        }
    }

}