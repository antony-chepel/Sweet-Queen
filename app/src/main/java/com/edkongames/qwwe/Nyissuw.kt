package com.edkongames.qwwe

import android.app.Application
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk

class Nyissuw : Application() {
    companion object {
        const val aoskdwij = "15bc7177-294b-4126-b740-2f1c696811e4"
        var fiijdosd: String? = "d11"
        var onkovbjiv: String? = ""
        var obkvnko = "appsChecker"
        var rokkosdf = "link"
        var foksfd: String? = "c11"
    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(aoskdwij)
        Hawk.init(this).build()
    }
}