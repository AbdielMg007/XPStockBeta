package com.example.xpstockbeta1.adapters

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.xpstockbeta1.R
import com.example.xpstockbeta1.listas.listaNombres
import com.example.xpstockbeta1.listas.listadb
import com.example.xpstockbeta1.listas.revisar

class adapterTarget(private val activity: Activity, var datoMarca: String) : RecyclerView.Adapter<adapterTarget.ViewHolder>(){

    val opcion = opcion(datoMarca)
    val newModelo: Array<String?> = llenarModelo(opcion, datoMarca)
    val newPrecio: Array<String?> = llenarPrecio(opcion, datoMarca)
    val tamanoArreglos = newModelo.size
    val newImages: Array<Int?> = llenarImages(opcion, datoMarca, tamanoArreglos)




    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        var iImage: ImageView
        var iPrecios: TextView
        var iModelo: TextView





        init {
            iImage = itemView.findViewById(R.id.itemImage)
            iModelo = itemView.findViewById(R.id.itemModelo)
            iPrecios = itemView.findViewById(R.id.itemPrecio)

        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.target_buscador, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {

        newImages[i]?.let { viewHolder.iImage.setImageResource(it) }
        viewHolder.iModelo.text = newModelo[i]
        viewHolder.iPrecios.text = newPrecio[i]


    }

    override fun getItemCount() =  newModelo.size
}

    fun opcion(dato: String):Int {

        val aux: Int
        if(dato.uppercase() == "SAMSUNG"  || dato.uppercase() == "HONOR" || dato.uppercase() == "LG" || dato.uppercase() == "HUAWEI" || dato.uppercase() == "APPLE" || dato.uppercase() == "ZTE" || dato.uppercase() == "REALME"  || dato.uppercase() == "MOTO" || dato.uppercase() == "OPPO" || dato.uppercase() == "XIAOMI"){
            aux = 1
        }
        else {
            aux = 2
        }
        return aux

    }

    fun llenarModelo(opcion: Int, marca: String): Array<String?> {
        var modeloDb = arrayOfNulls<String?>(394)
        var aux = 0
        if(opcion == 1) {
            for (i in 0..394) {
                val marcaChecada = listadb(i.toString(), "marca")
                if (marcaChecada().uppercase() == marca.uppercase()){
                    val modeloMandar= listadb(i.toString(), "modelo")
                    modeloDb[aux] = modeloMandar()
                    aux += 1
                }
            }
        }
        if(opcion == 2) {
            modeloDb = revisar(marca)
            aux = modeloDb.size
            for(i in 0 until aux){
                val modeloMandar = listadb(modeloDb[i].toString(), "modelo")
                val modeloMandarString: String = modeloMandar()
                modeloDb[i] = modeloMandarString
            }
        }

        val modelosMandar = arrayOfNulls<String?>(aux)
        for (i in 0 until aux) {
            modelosMandar[i] = modeloDb[i]
        }
        return modelosMandar
    }

fun llenarPrecio(opcion: Int, marca: String): Array<String?> {
    var modeloDb = arrayOfNulls<String?>(394)
    var aux = 0
    if(opcion == 1) {
        for (i in 0..394) {
            val marcaChecada = listadb(i.toString(), "marca")
            if (marcaChecada().uppercase() == marca.uppercase()){
                val modeloMandar= listadb(i.toString(), "precio")
                modeloDb[aux] = modeloMandar()
                aux += 1
            }
        }
    }
    if(opcion == 2) {
        modeloDb = revisar(marca)
        aux = modeloDb.size
        for(i in 0 until aux){
            val modeloMandar = listadb(modeloDb[i].toString(), "precio")
            val modeloMandarString: String = modeloMandar()
            modeloDb[i] = modeloMandarString
        }
    }

    val modelosMandar = arrayOfNulls<String?>(aux)
    for (i in 0 until aux) {
        modelosMandar[i] = modeloDb[i]
    }
    return modelosMandar
}

fun llenarImages(opcion: Int, marca: String, tamano: Int):Array<Int?>{
        val imagesDb = arrayOfNulls<Int?>(tamano)
        if(opcion == 1){
            if (marca.uppercase() == "SAMSUNG"){
                for (i in 0 until tamano) {
                    imagesDb[i] = R.drawable.samsung
                }
            }
            if (marca.uppercase() == "IPHONE"){
                for (i in 0 until tamano) {
                    imagesDb[i] = R.drawable.apple
                }
            }
            if (marca.uppercase() == "LG"){
                for (i in 0 until tamano) {
                    imagesDb[i] = R.drawable.lg
                }
            }
            if (marca.uppercase() == "HONOR"){
                for (i in 0 until tamano) {
                    imagesDb[i] = R.drawable.honor
                }
            }
            if (marca.uppercase() == "HUAWEI"){
                for (i in 0 until tamano) {
                    imagesDb[i] = R.drawable.huawei
                }
            }
            if (marca.uppercase() == "ZTE"){
                for (i in 0 until tamano) {
                    imagesDb[i] = R.drawable.zte
                }
            }
            if (marca.uppercase() == "MOTO"){
                for (i in 0 until tamano) {
                    imagesDb[i] = R.drawable.motorola
                }
            }
            if (marca.uppercase() == "REALME"){
                for (i in 0 until tamano) {
                    imagesDb[i] = R.drawable.realme
                }
            }
            if (marca.uppercase() == "OPPO"){
                for (i in 0 until tamano) {
                    imagesDb[i] = R.drawable.oppo
                }
            }
            if (marca.uppercase() == "XIAOMI"){
                for (i in 0 until tamano) {
                    imagesDb[i] = R.drawable.xiaomi
                }
            }
        }
        if(opcion == 2){
        val listaAuxiliar = revisar(marca)
        for(i in 0 until tamano){
            val modeloMandar = listadb(listaAuxiliar[i].toString() , "marca")
            val modeloMandarString: String = modeloMandar().uppercase()
            if (modeloMandarString == "SAMSUNG"){
                imagesDb[i] = R.drawable.samsung
            }
            if (modeloMandarString == "IPHONE"){
                imagesDb[i] = R.drawable.apple
            }
            if (modeloMandarString == "LG"){
                imagesDb[i] = R.drawable.lg
            }
            if (modeloMandarString == "HONOR"){
                imagesDb[i] = R.drawable.honor
            }
            if (modeloMandarString == "HUAWEI"){
                imagesDb[i] = R.drawable.huawei
            }
            if (modeloMandarString == "ZTE"){
                imagesDb[i] = R.drawable.zte
            }
            if (modeloMandarString == "MOTO"){
                imagesDb[i] = R.drawable.motorola
            }
            if (modeloMandarString == "REALME"){
                imagesDb[i] = R.drawable.realme
            }
            if (modeloMandarString == "OPPO"){
                imagesDb[i] = R.drawable.oppo
            }
            if (modeloMandarString == "XIAOMI"){
                imagesDb[i] = R.drawable.xiaomi
            }
        }
    }

        return imagesDb
    }



