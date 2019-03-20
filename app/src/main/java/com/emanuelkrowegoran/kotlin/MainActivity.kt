package com.emanuelkrowegoran.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Nama = findViewById<TextView>(R.id.nama)
        Nama.text = "Emanuel Krowe Goran"
        val NIM = findViewById<TextView>(R.id.nim)
        NIM.text = "165410097"
    }
}
