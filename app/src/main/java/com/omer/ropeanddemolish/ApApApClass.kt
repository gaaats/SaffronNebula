package com.omer.ropeanddemolish

import android.app.Application
import android.content.Context
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.onesignal.OneSignal
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ApApApClass : Application() {

    companion object {

        const val jsoupCheck = "1v5b"
        const val ONESIGNAL_APP_ID = "1c992fa6-3c49-40af-beb4-b532635c6102"
        const val AF_DEV_KEY = "ExEAkH3iHwskJAFhwuDwkN"


        val linkAppsCheckPart1 = "http://saffron"
        val linkAppsCheckPart2 = "nebula.live/apps.txt"
        val linkFilterPart1 = "http://saffron"
        val linkFilterPart2 = "nebula.live/go.php?to=1&"
        val odone = "sub_id_1="

        var C13: String? = "c13"
        var D1: String? = "d11"
        var CH: String? = "check"

        var MAIN_ID: String? = ""
        var C1: String? = "c11"


    }

    override fun onCreate() {
        super.onCreate()

        GlobalScope.launch(Dispatchers.IO) {
            aproximo(context = applicationContext)
        }
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)

    }

    private suspend fun aproximo(context: Context) {
        val admond = AdvegoMan(context)
        val induk = admond.giriko()

        val perec = getSharedPreferences("SP", MODE_PRIVATE)
        val edmondos = perec.edit()

        edmondos.putString(MAIN_ID, induk)
        edmondos.apply()
    }

}

class AdvegoMan(context: Context) {
    private val adolfik = AdvertisingIdClient(context.applicationContext)

    suspend fun giriko(): String =
        withContext(Dispatchers.IO) {
            adolfik.start()
            val adoniis = adolfik.info
            adoniis.id
        }
}