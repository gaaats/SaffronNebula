package com.omer.ropeanddemolish

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.omer.ropeanddemolish.ApApApClass.Companion.AF_DEV_KEY
import com.omer.ropeanddemolish.ApApApClass.Companion.C1
import com.omer.ropeanddemolish.ApApApClass.Companion.CH
import com.omer.ropeanddemolish.ApApApClass.Companion.D1
import com.omer.ropeanddemolish.ApApApClass.Companion.linkAppsCheckPart1
import com.omer.ropeanddemolish.ApApApClass.Companion.linkAppsCheckPart2
import com.omer.ropeanddemolish.databinding.ActivityMainBinding
import com.omer.ropeanddemolish.gamegame.GgggggggameActivity
import kotlinx.coroutines.*
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {
    private lateinit var bobik: ActivityMainBinding
    lateinit var jsjjsjs: String
    var chockor: String = "null"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bobik = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bobik.root)
        jsjjsjs = ""
        ssssdkeerfprp(this)

        val pretttor = getSharedPreferences("ActivityPREF", MODE_PRIVATE)
        if (pretttor.getBoolean("activity_exec", false)) {
            val shasha = getSharedPreferences("SP", MODE_PRIVATE)
            when (shasha.getString(CH, "null")) {

                "2" -> {
                    skrskr()
                }
                "3" -> {
                    totoototos()
                }
                "4" -> {
                    tottotos()
                }
                "nm" -> {
                    tottotos()
                }
                "dp" -> {
                    tottotos()
                }
                "org" -> {
                    skrskr()
                }
                else -> {
                    skrskr()
                }
            }

        } else {
            val exelllchik = pretttor.edit()
            exelllchik.putBoolean("activity_exec", true)
            exelllchik.apply()

            val jasonnnn = GlobalScope.launch(Dispatchers.IO) {
                chockor = gota(linkAppsCheckPart1 + linkAppsCheckPart2)
            }
            runBlocking {
                try {
                    jasonnnn.join()
                } catch (_: Exception) {
                }
            }

            when (chockor) {
                "1" -> {
                    AppsFlyerLib.getInstance()
                        .init(AF_DEV_KEY, cococococr, applicationContext)
                    AppsFlyerLib.getInstance().start(this)
                    afNeftggtgtgtgtd(1500)
                }
                "2" -> {
                    skrskr()
                }
                "3" -> {
                    AppsFlyerLib.getInstance()
                        .init(AF_DEV_KEY, cococococr, applicationContext)
                    AppsFlyerLib.getInstance().start(this)
                    ififififiif(1500)
                }
                "4" -> {
                    tottotos()
                }

            }
        }
    }


    private suspend fun gota(link: String): String {
        val urchik = URL(link)
        val onick = "1"
        val tttgttwoStr = "2"
        val gtthyyyytestStr = "3"
        val ftgyhyufujuourStr = "4"
        val acrggtgy = "0"
        val or4i = withContext(Dispatchers.IO) {
            urchik.openConnection()
        } as HttpURLConnection

        return try {
            when (val dfrfgtgt6 = or4i.inputStream.bufferedReader().readText()) {

                "1" -> {
                    onick
                }
                "2" -> {
                    val shshshshssharPref =
                        applicationContext.getSharedPreferences("SP", MODE_PRIVATE)
                    val edokkk = shshshshssharPref.edit()
                    edokkk.putString(CH, tttgttwoStr)
                    edokkk.apply()
                    tttgttwoStr
                }
                "3" -> {
                    val dfrfrggg5sharPref =
                        applicationContext.getSharedPreferences("SP", MODE_PRIVATE)
                    val edddmod = dfrfrggg5sharPref.edit()
                    edddmod.putString(CH, gtthyyyytestStr)
                    edddmod.apply()
                    gtthyyyytestStr
                }
                "4" -> {
                    val shssoforfr = applicationContext.getSharedPreferences("SP", MODE_PRIVATE)
                    val defrfrrr5 = shssoforfr.edit()
                    defrfrrr5.putString(CH, ftgyhyufujuourStr)
                    defrfrrr5.apply()
                    ftgyhyufujuourStr
                }
                else -> {
                    acrggtgy
                }
            }
        } finally {
            or4i.disconnect()
        }

    }

    private fun afNeftggtgtgtgtd(timeInterval: Long): Job {

        val shrttta = getSharedPreferences("SP", MODE_PRIVATE)
        return CoroutineScope(Dispatchers.IO).launch {
            while (NonCancellable.isActive) {
                val vfghhhhawk1: String? = shrttta.getString(C1, null)
                val ddoododk: String? = shrttta.getString(D1, "null")
                if (vfghhhhawk1 != null) {
                    if (vfghhhhawk1.contains("tdb2")) {
                        val frfrfrr = shrttta.edit()
                        frfrfrr.putString(CH, "nm")
                        frfrfrr.apply()
                        tottotos()
                    } else if (ddoododk != null) {
                        if (ddoododk.contains("tdb2")) {
                            tottotos()
                        } else {
                            val editor = shrttta.edit()
                            editor.putString(CH, "org")
                            editor.apply()
                            skrskr()
                        }
                    }
                    break
                } else {
                    val hawk1: String? = shrttta.getString(C1, null)
                    delay(timeInterval)
                }
            }
        }
    }

    private fun ififififiif(timeInterval: Long): Job {
        val shshshshfr = getSharedPreferences("SP", MODE_PRIVATE)
        return CoroutineScope(Dispatchers.IO).launch {
            while (NonCancellable.isActive) {
                val hohohoh: String? = shshshshfr.getString(C1, null)
                if (hohohoh != null) {
                    totoototos()
                    break
                } else {
                    val hawk1: String? = shshshshfr.getString(C1, null)
                    delay(timeInterval)
                }
            }
        }
    }

    val cococococr = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val shshsajdr = applicationContext.getSharedPreferences("SP", MODE_PRIVATE)
            val defrkrfkrkri = shshsajdr.edit()
            val dffrfrrrfrfr = data?.get("campaign").toString()
            defrkrfkrkri.putString(C1, dffrfrrrfrfr)
            defrkrfkrkri.apply()
        }

        override fun onConversionDataFail(p0: String?) {

        }

        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(p0: String?) {
        }
    }


    private fun tottotos() {
        Intent(this, VibivibiVievActivity::class.java)
            .also { startActivity(it) }
        finish()
    }

    private fun skrskr() {
        Intent(this, GgggggggameActivity::class.java)
            .also { startActivity(it) }
        finish()
    }


    fun ssssdkeerfprp(context: Context) {
        val sssssshahdhefr = applicationContext.getSharedPreferences("SP", MODE_PRIVATE)
        val sedefffr = sssssshahdhefr.edit()
        AppLinkData.fetchDeferredAppLinkData(
            context
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                val fffpfpepepep = appLinkData.targetUri.host
                sedefffr.putString(D1, fffpfpepepep.toString())
                sedefffr.apply()
                if (fffpfpepepep!!.contains("tdb2")) {
                    sedefffr.putString(CH, "dp")
                    sedefffr.apply()
                }

            }
            if (appLinkData == null) {

            }

        }
    }

    private fun totoototos() {
        Intent(this, FiiillllfillterActivity::class.java)
            .also { startActivity(it) }
        finish()
    }

}