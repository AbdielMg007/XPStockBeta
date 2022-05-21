package com.example.xpstockbeta1.adapters

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.xpstockbeta1.R

class adapterTargetBusqueda(private val activity: Activity, var datoMarca: String) : RecyclerView.Adapter<adapterTargetBusqueda.ViewHolder>(){

    val opcion = opcion(datoMarca)

    val newModelo: Array<String?> = llenarModelo(opcion, datoMarca)
    val tamanoArreglos = newModelo.size
    val arregloPrecios: Array<Array<String?>> = crearArregloPrecios(opcion, datoMarca)

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        var iModelo: TextView
        var iCalidades: RecyclerView



        init {
            iModelo = itemView.findViewById(R.id.itemModeloPrecios)
            iCalidades = itemView.findViewById(R.id.calidadesPrecios)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.target_lista, parent, false)
        return ViewHolder(v)
    }


    override fun getItemCount() =  newModelo.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val newCalidad: Array<String?> = llenarPrecios(opcion,position, arregloPrecios)
        val calidades = adapterCalidades(newCalidad)
        val linearLayoutManager = LinearLayoutManager(activity)

        holder.iModelo.text = newModelo[position]
        holder.iCalidades.layoutManager = linearLayoutManager
        holder.iCalidades.adapter = calidades
    }

}


