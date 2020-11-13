package com.serlog.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("LOGCICLO","enter to methot onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("LOGCICLO","enter to methot onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LOGCICLO","enter to methot onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("LOGCICLO","enter to methot onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("LOGCICLO","enter to methot onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LOGCICLO","enter to methot onDestroy")
    }
    override fun onRestart() {
        super.onRestart()
        Log.i("LOGCICLO","enter to methot onRestart")
    }

    fun clickOnHobby(view: View) {
        val checkbox:CheckBox=view as CheckBox
        val checked:Boolean=checkbox.isChecked
        when(view.id){
            R.id.checkBox->{
                if(checked){
                    Toast.makeText(this,"Se marco deportes",Toast.LENGTH_LONG).show()
                }
                else{
                    Toast.makeText(this,"Se  desmarco deportes",Toast.LENGTH_LONG).show()
                }
            }
            R.id.checkBox2->{
                if(checked){
                    Toast.makeText(this,"Se marco videojuegos",Toast.LENGTH_LONG).show()
                }
                else{
                    Toast.makeText(this,"Se  desmarco videjuegos",Toast.LENGTH_LONG).show()
                }            }
        }
    }
}
