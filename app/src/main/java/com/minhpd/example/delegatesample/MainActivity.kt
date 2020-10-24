package com.minhpd.example.delegatesample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

const val TAG = "MainActivity"

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
        Log.d(TAG, "recover item: ${listWithTrash.recover()}")

        val person = Person("Minh", "Pham")
        Log.d(TAG, "Update count is ${person.updateCount}")
        person.name = "Chau"
        Log.d(TAG, "Update count is ${person.updateCount}")
        person.lastName = "Le"
        Log.d(TAG, "Update count is ${person.updateCount}")
    }
}