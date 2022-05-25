package com.example.xpstockbeta1.pantallas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.xpstockbeta1.R

class pantallaConfiguracionFiltros : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_configuracion_filtros)
        val boton = findViewById<Button>(R.id.aplica)
        boton.setOnClickListener {
            val pasar = Intent(this, PantallaMainMenu::class.java)
            startActivity(pasar)
            finish()
        }
    }

}