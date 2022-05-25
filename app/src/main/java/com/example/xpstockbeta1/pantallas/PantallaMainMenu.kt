package com.example.xpstockbeta1.pantallas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.xpstockbeta1.R

class PantallaMainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_XPStockBeta1)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buscador(view: View?) {
        val pasar = Intent(this, buscar::class.java)
        startActivity(pasar)
    }
    fun precios(view: View?) {
        val pasar = Intent(this, precios::class.java)
        startActivity(pasar)
    }
    fun configuracion(view: View?) {
        val pasar = Intent(this, inventario()::class.java)
        startActivity(pasar)
    }
}