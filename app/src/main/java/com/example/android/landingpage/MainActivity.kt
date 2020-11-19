package com.example.android.landingpage

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var alertButton: ImageButton? = null
    //private var alertTextView: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        alertButton = findViewById<View>(R.id.imageButton2) as ImageButton
        //alertTextView = findViewById<View>(R.id.AlertTextView) as TextView
        alertButton!!.setOnClickListener {
            val builder: AlertDialog.Builder = AlertDialog.Builder(this@MainActivity)
            builder.setCancelable(true)
            builder.setTitle("Order Accepted!")
            builder.setMessage("Great news! We have accepted your order! We will notify you when it has been dispatched!")
            builder.setNegativeButton("Cancel",
                DialogInterface.OnClickListener { dialogInterface, i -> dialogInterface.cancel() })
            builder.setPositiveButton("OK",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    //alertTextView!!.visibility = View.VISIBLE
                })
            builder.show()
        }

    }

}