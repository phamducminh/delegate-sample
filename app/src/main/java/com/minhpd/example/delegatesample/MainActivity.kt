package com.minhpd.example.delegatesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listWithTrash = ListWithTrash<String>().apply {
            add("123")
            add("456")
            add("789")
        }

        listWithTrash.remove("456")
        Log.d("MainActivity", "recover item: ${listWithTrash.recover()}")
    }
}