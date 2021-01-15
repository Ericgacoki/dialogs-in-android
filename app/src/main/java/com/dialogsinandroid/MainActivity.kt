package com.dialogsinandroid

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.dialogsinandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var activityMainBinding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        handleButtonClicks()
    }

    private fun handleButtonClicks() {
        activityMainBinding?.basicDialog?.setOnClickListener {
            showDialog()
        }
    }

    private fun showDialog() {
        val alertDialogB = AlertDialog.Builder(this)

        alertDialogB.apply {
            setTitle("Hello Dude")
            setPositiveButton("Positive") { _, _ ->
            }
            setNegativeButton("Negative") { _, _ ->
            }

        }.create().show()
    }

    /* avoid holding references to non-existing locations*/
    override fun onDestroy() {

        super.onDestroy()
        activityMainBinding = null
    }
}