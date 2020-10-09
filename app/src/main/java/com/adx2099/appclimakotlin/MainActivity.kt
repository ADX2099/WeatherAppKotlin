package com.adx2099.appclimakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var tvGrados: TextView? = null
    var tvCiudad: TextView? = null
    var tvStatus: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvCiudad = findViewById(R.id.tvCiudad)
        tvGrados = findViewById(R.id.tvGrados)
        tvStatus = findViewById(R.id.tvStatus)

        val ciudad = intent.getStringExtra("com.adx2099.appclimakotlin.CIUDAD")


        val ciudadMx = Ciudad("Ciudad de Mexico", 32, "Soleado")
        val ciudadBer = Ciudad("Berlin", 12, "Nublado")
        if(ciudad == "ciudad-mexico"){
            tvCiudad?.text = ciudadMx.nombre
            tvGrados?.text = ciudadMx.grados.toString()
            tvStatus?.text = ciudadMx.status
        }else if(ciudad == "ciudad-berlin"){
            tvCiudad?.text = ciudadBer.nombre
            tvGrados?.text = ciudadBer.grados.toString()
            tvStatus?.text = ciudadBer.status
        }else{
            Toast.makeText(this, "No se encuentra la info", Toast.LENGTH_LONG).show()
        }
    }
}
