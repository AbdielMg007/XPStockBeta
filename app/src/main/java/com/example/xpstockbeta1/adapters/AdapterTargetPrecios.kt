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
    val newPrecio: Array<String?> = llenarPrecio(opcion, datoMarca)

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        var iModelo: TextView
        var iPrecio: TextView



        init {
            iModelo = itemView.findViewById(R.id.itemModeloPrecios)
            iPrecio = itemView.findViewById(R.id.itemPrecioPrecios)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.target_lista, parent, false)
        return ViewHolder(v)
    }


    override fun getItemCount() =  newModelo.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.iModelo.text = newModelo[position]
        holder.iPrecio.text = newPrecio[position]
    }

}


