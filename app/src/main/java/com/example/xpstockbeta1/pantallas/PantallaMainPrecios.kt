package com.example.xpstockbeta1.pantallas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.xpstockbeta1.R

class precios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_precios)
    }

    fun samsung(view: View?) {
        val marca = "Samsung"
        val pasar = Intent(this, pantallaLista::class.java)
        pasar.putExtra("marca", marca)
        startActivity(pasar)
    }
    fun apple(view: View?) {
        val marca = "Apple"
        val pasar = Intent(this, pantallaLista::class.java)
        pasar.putExtra("marca", marca)
        startActivity(pasar)
    }
    fun lg(view: View?) {
        val marca = "LG"
        val pasar = Intent(this, pantallaLista::class.java)
        pasar.putExtra("marca", marca)
        startActivity(pasar)
    }
    fun honor(view: View?) {
        val marca = "Honor"
        val pasar = Intent(this, pantallaLista::class.java)
        pasar.putExtra("marca", marca)
        startActivity(pasar)
    }
    fun huawei(view: View?) {
        val marca = "Huawei"
        val pasar = Intent(this, pantallaLista::class.java)
        pasar.putExtra("marca", marca)
        startActivity(pasar)
    }
    fun zte(view: View?) {
        val marca = "ZTE"
        val pasar = Intent(this, pantallaLista::class.java)
        pasar.putExtra("marca", marca)
        startActivity(pasar)
    }
    fun motorola(view: View?) {
        val marca = "Motorola"
        val pasar = Intent(this, pantallaLista::class.java)
        pasar.putExtra("marca", marca)
        startActivity(pasar)
    }
    fun realme(view: View?) {
        val marca = "Realme"
        val pasar = Intent(this, pantallaLista::class.java)
        pasar.putExtra("marca", marca)
        startActivity(pasar)
    }
    fun oppo(view: View?) {
        val marca = "OPPO"
        val pasar = Intent(this, pantallaLista::class.java)
        pasar.putExtra("marca", marca)
        startActivity(pasar)
    }
    fun xiaomi(view: View?) {
        val marca = "Xiaomi"
        val pasar = Intent(this, pantallaLista::class.java)
        pasar.putExtra("marca", marca)
        startActivity(pasar)
    }

}