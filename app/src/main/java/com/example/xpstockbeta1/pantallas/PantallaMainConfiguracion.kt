package com.example.xpstockbeta1.pantallas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.xpstockbeta1.R

class inventario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.supportActionBar?.hide()
        setContentView(R.layout.activity_main_configuracion)
        val botonFiltro = findViewById<Button>(R.id.btnFiltro)
        val botonInventario = findViewById<Button>(R.id.btnInventario)
        botonFiltro.setOnClickListener {
            val pasar = Intent(this, pantallaConfiguracionFiltros::class.java)
            startActivity(pasar)
            finish()
        }
        botonInventario.setOnClickListener {
            val pasar = Intent(this, pantallaConfiguracionFiltros::class.java)
            startActivity(pasar)
            finish()
        }

    }

}