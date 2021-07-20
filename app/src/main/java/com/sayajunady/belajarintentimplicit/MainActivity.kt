package com.sayajunady.belajarintentimplicit

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDialNumber: Button = findViewById(R.id.btndial)
        btnDialNumber.setOnClickListener(this)

        val btnBrowser: Button = findViewById(R.id.btnbrowser)
        btnBrowser.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btndial -> {
                val phoneNumber = "09515274844"
                val dialNumber = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialNumber)

            }

            R.id.btnbrowser -> {
                val url = "https://www.facebook.com/"
                val web = Intent(Intent.ACTION_VIEW)
                web.setData(Uri.parse(url))
                startActivity(web)
            }
        }
    }
}