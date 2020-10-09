package com.adx2099.appclimakotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Ciudades : AppCompatActivity() {
    val TAG = "com.adx2099.appclimakotlin.CIUDAD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)
        val bMexico = findViewById<Button>(R.id.buttonMex)
        val bBerlin = findViewById<Button>(R.id.buttonBerlin)

        bMexico.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-mexico")
            startActivity(intent)
        }

        bBerlin.setOnClickListener{

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-berlin")
            startActivity(intent)
        }
    }
}
