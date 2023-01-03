package com.edkongames.jusoa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.edkongames.databinding.ActivityDescxvdsBinding
import com.edkongames.qwwe.Cdestyauw

class Descxvds : AppCompatActivity() {
    private lateinit var xockxkoz : ActivityDescxvdsBinding
    private var sidjas = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        xockxkoz = ActivityDescxvdsBinding.inflate(layoutInflater)
        setContentView(xockxkoz.root)
        sidjas = intent.getIntExtra("resC",0)
      when(sidjas){
          0->{
            xockxkoz.rokkodkos.text = "Nothing won, try again"
          }
          1->{
              xockxkoz.rokkodkos.text = "You won 500 candy points"
          }

          2->{
              xockxkoz.rokkodkos.text = "You won 1000 candy points"
          }
          3->{
              xockxkoz.rokkodkos.text = "You won 1500 candy points"
          }
          4->{
              xockxkoz.rokkodkos.text = "You won 2000 candy points"
          }
          5->{
              xockxkoz.rokkodkos.text = "You won 5000 candy points"
          }
      }

        xockxkoz.ckvcmxk.setOnClickListener {
            startActivity(Intent(this,Cdestyauw::class.java))
        }

    }
}