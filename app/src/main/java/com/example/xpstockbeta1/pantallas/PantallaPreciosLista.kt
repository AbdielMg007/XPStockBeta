package com.example.xpstockbeta1.pantallas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.xpstockbeta1.R
import com.example.xpstockbeta1.adapters.adapterTargetBusqueda

class pantallaLista : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_precios_lista)
        val buscar = intent.getStringExtra("marca").toString()

        val recyclerView = findViewById<RecyclerView>(R.id.listaMarcaPedida)
        val adapter = adapterTargetBusqueda(this,buscar)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}