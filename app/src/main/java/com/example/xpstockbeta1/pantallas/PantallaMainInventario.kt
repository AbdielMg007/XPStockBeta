package com.example.xpstockbeta1.pantallas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.xpstockbeta1.R
import com.example.xpstockbeta1.adapters.adapterTarget

class inventario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.supportActionBar?.hide()
        setContentView(R.layout.activity_main_inventario)

        var samsung = "1"

        val recyclerView = findViewById<RecyclerView>(R.id.listatodo)
        val adapter = adapterTarget(this,samsung)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

    }
}