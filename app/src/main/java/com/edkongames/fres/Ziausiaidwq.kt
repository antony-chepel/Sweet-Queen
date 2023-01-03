package com.edkongames.fres
import android.annotation.SuppressLint
import org.json.JSONException
import org.json.JSONObject
import com.edkongames.fres.Btsisodkw.rokdf
import com.edkongames.fres.Btsisodkw.gplhgf

import com.edkongames.fres.Btsisodkw.iokdf
import java.io.File
import java.io.IOException


import com.edkongames.qwwe.Nyissuw.Companion.fiijdosd
import com.edkongames.qwwe.Nyissuw.Companion.foksfd
import com.edkongames.fres.Btsisodkw.odksaodk
import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal

import com.orhanobut.hawk.Hawk

import com.edkongames.fres.Btsisodkw.xozkcz
import com.edkongames.fres.Btsisodkw.cijv
import com.edkongames.fres.Btsisodkw.xozkcoz
import com.edkongames.fres.Btsisodkw.qopkkods
import com.edkongames.fres.Btsisodkw.eopsllpadalpsdko
import com.edkongames.fres.Btsisodkw.woks
import android.app.Activity

import android.content.Intent
import com.edkongames.fres.Btsisodkw.cijxvix
import android.content.pm.PackageManager
import android.net.Uri

import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.provider.MediaStore
import android.util.Log

import android.webkit.*

import android.widget.Toast
import com.edkongames.R
import com.edkongames.databinding.ActivityGtrsdfBinding
import com.edkongames.qwwe.Nyissuw.Companion.onkovbjiv





class Ziausiaidwq : AppCompatActivity() {
    private val dfokfdko = 1
    private var oxoxicj = false

    var siodkkoksd = ""

    var xcokzczxuuch: ValueCallback<Array<Uri>>? = null
    var rokdofki = ""

    lateinit var osdplxzck: WebView
    lateinit var qopwk: ActivityGtrsdfBinding
    var fisdofk: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        qopwk = ActivityGtrsdfBinding.inflate(layoutInflater)
        setContentView(qopwk.root)

        osdplxzck = qopwk.dsiofksdwq
        Snackbar.make(
            qopwk.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()


        val gokdfok = CookieManager.getInstance()
        gokdfok.setAcceptCookie(true)
        gokdfok.setAcceptThirdPartyCookies(osdplxzck, true)
        opkwsplaldasdk()
        val xozk: Activity = this
        osdplxzck.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(rokodks: WebView, idofk: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(idofk)) {
                        return false
                    }
                    if (qpllsdpsa(idofk)) {

                        val tokdsfisdofo = Intent(Intent.ACTION_VIEW)
                        tokdsfisdofo.data = Uri.parse(idofk)
                        startActivity(tokdsfisdofo)
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
                rokodks.loadUrl(idofk)
            }


            override fun onPageFinished(dokf: WebView, ozkxcxko: String) {
                super.onPageFinished(dokf, ozkxcxko)
                toodsfksdo(ozkxcxko)
            }

            override fun onReceivedError(
                riodkf: WebView,
                aopasl: Int,
                toppld: String,
                vockovc: String
            ) {
                Toast.makeText(xozk, toppld, Toast.LENGTH_SHORT).show()
            }


        }
        osdplxzck.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                dokfd: WebView, paslapl: ValueCallback<Array<Uri>>,
                eowk: FileChooserParams
            ): Boolean {
                xcokzczxuuch?.onReceiveValue(null)
                xcokzczxuuch = paslapl
                var gokomkcvkoxco: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (gokomkcvkoxco!!.resolveActivity(packageManager) != null) {

                    var rokkosdijsa: File? = null
                    try {
                        rokkosdijsa = oikokofdsof()
                        gokomkcvkoxco.putExtra("PhotoPath", fisdofk)
                    } catch (ex: IOException) {

                    }


                    if (rokkosdijsa != null) {
                        fisdofk = "file:" + rokkosdijsa.absolutePath
                        gokomkcvkoxco.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(rokkosdijsa)
                        )
                    } else {
                        gokomkcvkoxco = null
                    }
                }
                val ovbkbijnvb = Intent(Intent.ACTION_GET_CONTENT)
                ovbkbijnvb.addCategory(Intent.CATEGORY_OPENABLE)
                ovbkbijnvb.type = "image/*"
                val ijjiokdasko: Array<Intent?> =
                    gokomkcvkoxco?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val qopksdpsad = Intent(Intent.ACTION_CHOOSER)
                qopksdpsad.putExtra(Intent.EXTRA_INTENT, ovbkbijnvb)
                qopksdpsad.putExtra(Intent.EXTRA_TITLE, getString(R.string.image_chooser))
                qopksdpsad.putExtra(Intent.EXTRA_INITIAL_INTENTS, ijjiokdasko)
                startActivityForResult(
                    qopksdpsad, dfokfdko
                )
                return true
            }


            @Throws(IOException::class)
            private fun oikokofdsof(): File {
                var xijcjixz = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!xijcjixz.exists()) {
                    xijcjixz.mkdirs()
                }


                xijcjixz =
                    File(xijcjixz.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return xijcjixz
            }

        }

        osdplxzck.loadUrl(tokpfdldfs())
    }






    override fun onActivityResult(rokdokf: Int, xozck: Int, siodaskda: Intent?) {
        if (rokdokf != dfokfdko || xcokzczxuuch == null) {
            super.onActivityResult(rokdokf, xozck, siodaskda)
            return
        }
        var foppglgf: Array<Uri>? = null


        if (xozck == AppCompatActivity.RESULT_OK) {
            if (siodaskda == null || siodaskda.data == null) {
                foppglgf = arrayOf(Uri.parse(fisdofk))
            } else {
                val ciojvixcvj = siodaskda.dataString
                if (ciojvixcvj != null) {
                    foppglgf = arrayOf(Uri.parse(ciojvixcvj))
                }
            }
        }
        xcokzczxuuch?.onReceiveValue(foppglgf)
        xcokzczxuuch = null
    }

    private fun tokpfdldfs(): String {

        val cokv = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)

        val eoksadkoa: String? = Hawk.get(fiijdosd, "null")
        val roplldsakodaks:String? = Hawk.get(foksfd, "null")
        val bokvbbjivvbjibvji: String? = Hawk.get(onkovbjiv, "null")


        val erjkkosadko = AppsFlyerLib.getInstance().getAppsFlyerUID(this)


        AppsFlyerLib.getInstance().setCollectAndroidID(true)



        if (roplldsakodaks != "null"){
            siodkkoksd = "$odksaodk$eopsllpadalpsdko$roplldsakodaks&$gplhgf$erjkkosadko&$iokdf$bokvbbjivvbjibvji&$rokdf$qopkkods&$cijv$cijxvix&$xozkcz$woks"
            romkcxvxjicvjcx(erjkkosadko.toString())
        } else {
            siodkkoksd = "$odksaodk$eopsllpadalpsdko$eoksadkoa&$gplhgf$erjkkosadko&$iokdf$bokvbbjivvbjibvji&$rokdf$qopkkods&$cijv$cijxvix&$xozkcz$xozkcoz"
            romkcxvxjicvjcx(erjkkosadko.toString())
        }

        Log.d("TESTAG", "Test Result $siodkkoksd")
        return cokv.getString("SAVED_URL", siodkkoksd).toString()
    }






    override fun onBackPressed() {


        if (osdplxzck.canGoBack()) {
            if (oxoxicj) {
                osdplxzck.stopLoading()
                osdplxzck.loadUrl(rokdofki)
            }
            this.oxoxicj = true
            osdplxzck.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                oxoxicj = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }


    @SuppressLint("SetJavaScriptEnabled")
    private fun opkwsplaldasdk() {
        val docpxlvpclpv = osdplxzck.settings
        docpxlvpclpv.javaScriptCanOpenWindowsAutomatically = true
        docpxlvpclpv.setSupportMultipleWindows(false)

        docpxlvpclpv.allowFileAccess = true
        docpxlvpclpv.javaScriptEnabled = true


        docpxlvpclpv.setAppCacheEnabled(true)
        docpxlvpclpv.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        docpxlvpclpv.pluginState = WebSettings.PluginState.ON
        docpxlvpclpv.loadWithOverviewMode = true
        docpxlvpclpv.userAgentString = docpxlvpclpv.userAgentString.replace("; wv", "")
        docpxlvpclpv.useWideViewPort = true
        docpxlvpclpv.domStorageEnabled = true

        docpxlvpclpv.setSupportZoom(true)
        docpxlvpclpv.allowContentAccess = true
        docpxlvpclpv.builtInZoomControls = true
        docpxlvpclpv.displayZoomControls = false

    }



    private fun qpllsdpsa(dokdf: String): Boolean {

        val ocxovkvcx = packageManager
        try {

            ocxovkvcx.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)


            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }


    fun toodsfksdo(rokd: String?) {
        if (!rokd!!.contains("t.me")) {

            if (rokdofki == "") {
                rokdofki = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    rokd
                ).toString()

                val xozkxcijzxj = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val roplsad = xozkxcijzxj.edit()
                roplsad.putString("SAVED_URL", rokd)
                roplsad.apply()
            }
        }
    }


    private fun romkcxvxjicvjcx(xiocxk: String) {

        OneSignal.setExternalUserId(
            xiocxk,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(qowksdkkosd: JSONObject) {
                    try {
                        if (qowksdkkosd.has("push") && qowksdkkosd.getJSONObject("push").has("success")) {
                            val xock = qowksdkkosd.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $xock"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (qowksdkkosd.has("email") && qowksdkkosd.getJSONObject("email").has("success")) {
                            val oqkosjid =
                                qowksdkkosd.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $oqkosjid"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (qowksdkkosd.has("sms") && qowksdkkosd.getJSONObject("sms").has("success")) {
                            val zokxokzx = qowksdkkosd.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $zokxokzx"
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





}