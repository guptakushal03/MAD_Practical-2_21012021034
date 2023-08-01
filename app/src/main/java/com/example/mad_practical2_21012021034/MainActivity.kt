package com.example.mad_practical2_21012021034

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    var TAG : String = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMsg("onCreate() is called")
    }

    override fun onStart() {
        super.onStart()
        showMsg("onStart() is called")
    }

    override fun onResume() {
        super.onResume()
        showMsg("onResume() is called")
    }

    override fun onPause() {
        super.onPause()
        showMsg("onPause() is called")
    }

    override fun onStop() {
        super.onStop()
        showMsg("onStop() is called")
    }

    override fun onRestart() {
        super.onRestart()
        showMsg("onRestart() is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMsg("onDestroy() is called")
    }

    private fun showMsg(msg : String){
        Log.i(TAG, "$msg")
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        val v = findViewById<ConstraintLayout?>(R.id.mainlayout)
        if(v != null){
            Snackbar.make(v, msg, Snackbar.LENGTH_SHORT)
        }
    }
}