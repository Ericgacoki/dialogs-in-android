package com.dialogsinandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil as DB
import com.dialogsinandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var mainActivityBinding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainActivityBinding = DB.setContentView(this, R.layout.activity_main)
    }
}