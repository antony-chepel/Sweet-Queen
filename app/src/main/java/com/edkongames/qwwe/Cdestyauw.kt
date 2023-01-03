package com.edkongames.qwwe

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.edkongames.R
import com.edkongames.databinding.ActivityCdestyauwBinding
import com.edkongames.jusoa.Descxvds
import kotlin.random.Random

class Cdestyauw : AppCompatActivity() {
    private lateinit var xuzxis : ActivityCdestyauwBinding
   private  var intCount = 0
   private var nextScreen = 0
    private val listImg = listOf(
        R.drawable.cand_1,
        R.drawable.cand_2,
        R.drawable.cand_3,
        R.drawable.fr_1,
        R.drawable.fr_2,
        R.drawable.fr_3,
        R.drawable.fr_4,
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        xuzxis = ActivityCdestyauwBinding.inflate(layoutInflater)
        setContentView(xuzxis.root)
        nxyzxi()
    }


    @SuppressLint("UseCompatLoadingForDrawables")
    private fun nxyzxi() = with(xuzxis){
        imageView.setOnClickListener {
            imageView.isClickable = false
            nextScreen += 1
            imageView.setImageResource(listImg[Random.nextInt(7)])
            if (imageView.drawable.constantState == ContextCompat.getDrawable(this@Cdestyauw,R.drawable.cand_1)?.constantState ||
                imageView.drawable.constantState == ContextCompat.getDrawable(this@Cdestyauw,R.drawable.cand_2)?.constantState ||
                imageView.drawable.constantState == ContextCompat.getDrawable(this@Cdestyauw,R.drawable.cand_3)?.constantState
                    ) {
                intCount += 1
                tvCount.text = "Candies count : $intCount"
            }

            if (nextScreen == 5) {
                startActivity(Intent(this@Cdestyauw,Descxvds::class.java)
                    .putExtra("resC",intCount)
                )
            }
        }

            imageView2.setOnClickListener {
                imageView2.isClickable = false
                nextScreen +=1
                imageView2.setImageResource(listImg[Random.nextInt(7)])
                if (imageView2.drawable.constantState == ContextCompat.getDrawable(this@Cdestyauw,R.drawable.cand_1)?.constantState ||
                    imageView2.drawable.constantState == ContextCompat.getDrawable(this@Cdestyauw,R.drawable.cand_2)?.constantState ||
                    imageView2.drawable.constantState == ContextCompat.getDrawable(this@Cdestyauw,R.drawable.cand_3)?.constantState
                ){
                    intCount += 1
                    tvCount.text = "Candies count : $intCount"
                }

                if(nextScreen == 5){
                    startActivity(Intent(this@Cdestyauw,Descxvds::class.java)
                        .putExtra("resC",intCount)
                    )
                }

            }

            imageView3.setOnClickListener {
                imageView3.isClickable = false
                nextScreen +=1
                imageView3.setImageResource(listImg[Random.nextInt(7)])
                if (imageView3.drawable.constantState == ContextCompat.getDrawable(this@Cdestyauw,R.drawable.cand_1)?.constantState ||
                    imageView3.drawable.constantState == ContextCompat.getDrawable(this@Cdestyauw,R.drawable.cand_2)?.constantState ||
                    imageView3.drawable.constantState == ContextCompat.getDrawable(this@Cdestyauw,R.drawable.cand_3)?.constantState
                ){
                    intCount += 1
                    tvCount.text = "Candies count : $intCount"
                }

                if(nextScreen == 5){
                    startActivity(Intent(this@Cdestyauw,Descxvds::class.java)
                        .putExtra("resC",intCount)
                    )
                }


            }

            imageView4.setOnClickListener {
                imageView4.isClickable = false
                nextScreen +=1
                imageView4.setImageResource(listImg[Random.nextInt(7)])
                if (imageView4.drawable.constantState == ContextCompat.getDrawable(this@Cdestyauw,R.drawable.cand_1)?.constantState ||
                    imageView4.drawable.constantState == ContextCompat.getDrawable(this@Cdestyauw,R.drawable.cand_2)?.constantState ||
                    imageView4.drawable.constantState == ContextCompat.getDrawable(this@Cdestyauw,R.drawable.cand_3)?.constantState
                ){
                    intCount += 1
                    tvCount.text = "Candies count : $intCount"
                }
                if(nextScreen == 5){
                    startActivity(Intent(this@Cdestyauw,Descxvds::class.java)
                        .putExtra("resC",intCount)
                    )
                }

            }
            imageView5.setOnClickListener {
                imageView5.isClickable = false
                nextScreen +=1
                imageView5.setImageResource(listImg[Random.nextInt(7)])
                if (imageView5.drawable.constantState == ContextCompat.getDrawable(this@Cdestyauw,R.drawable.cand_1)?.constantState ||
                    imageView5.drawable.constantState == ContextCompat.getDrawable(this@Cdestyauw,R.drawable.cand_2)?.constantState ||
                    imageView5.drawable.constantState == ContextCompat.getDrawable(this@Cdestyauw,R.drawable.cand_3)?.constantState
                ){
                    intCount += 1
                    tvCount.text = "Candies count : $intCount"
                }

                if(nextScreen == 5){
                    startActivity(Intent(this@Cdestyauw,Descxvds::class.java)
                        .putExtra("resC",intCount)
                    )
                }

            }

        }

}