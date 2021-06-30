package com.azat_sabirov.kotlin_lesson1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var button: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        button?.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        Toast.makeText(
            this,
            button?.text,
            Toast.LENGTH_LONG
        ).show()

        val i = Intent(this, SecondActivity::class.java)
        startActivity(i)
    }
}