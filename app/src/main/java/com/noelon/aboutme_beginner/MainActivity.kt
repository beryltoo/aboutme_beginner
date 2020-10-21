package com.noelon.aboutme_beginner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        droidcamp_button.setOnClickListener {
            showToast("Droidcamp button clicked")
            //Todo: Replace "SomeActivity::class with your activity name then remove the comment
           val intent = Intent(this, AboutB::class.java)
           startActivity(intent)
        }
    }

    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}