package com.example.xpstockbeta1.pantallas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.xpstockbeta1.R
import com.example.xpstockbeta1.adapters.adapterTarget

class pantallaBusqueda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_precios_buscador)
        val buscar = intent.getStringExtra("marca").toString()

        val recyclerView = findViewById<RecyclerView>(R.id.listaCelularPedido)
        val adapter = adapterTarget(this,buscar)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}