package com.example.logging

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logging()
    }

    private fun logging() {
        //a verbose log is something that can be removed after a feature is implemented
        Log.v(TAG, "Hello, world!")
    }
}