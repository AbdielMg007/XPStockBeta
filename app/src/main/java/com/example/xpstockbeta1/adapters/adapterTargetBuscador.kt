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
    val tamanoArreglos = newModelo.size
    val newImages: Array<Int?> = llenarImages(opcion, datoMarca, tamanoArreglos)
    val arregloPrecios: Array<Array<String?>> = crearArregloPrecios(opcion, datoMarca)




    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        var iImage: ImageView
        var iModelo: TextView
        var iCalidades: RecyclerView



        init {
            iImage = itemView.findViewById(R.id.itemImage)
            iModelo = itemView.findViewById(R.id.itemModelo)
            iCalidades = itemView.findViewById(R.id.calidades)

        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.target_buscador, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {

        val newCalidad: Array<String?> = llenarPrecios(opcion,i, arregloPrecios)
        val calidades = adapterCalidades(newCalidad)
        val linearLayoutManager = LinearLayoutManager(activity)

        newImages[i]?.let { viewHolder.iImage.setImageResource(it) }
        viewHolder.iModelo.text = newModelo[i]
        viewHolder.iCalidades.layoutManager = linearLayoutManager
        viewHolder.iCalidades.adapter = calidades


    }

    override fun getItemCount() =  newModelo.size
}

    fun opcion(dato: String):Int {

        val aux: Int
        if(dato.uppercase() == "SAMSUNG"  || dato.uppercase() == "HONOR" || dato.uppercase() == "LG" || dato.uppercase() == "HUAWEI" || dato.uppercase() == "APPLE" || dato.uppercase() == "ZTE" || dato.uppercase() == "REALME"  || dato.uppercase() == "MOTOROLA" || dato.uppercase() == "OPPO" || dato.uppercase() == "XIAOMI"){
            aux = 1
        }
        else {
            aux = 2
        }
        return aux

    }

    fun crearArregloPrecios(opcion: Int, marca: String): Array<Array<String?>> {
        val preciosDb = Array(6) { arrayOfNulls<String>(290) }
        var aux = 0
        if(opcion == 1) {
            for (i in 0..290) {
                val marcaChecada = listadb(i.toString(), "marca")
                if (marcaChecada().uppercase() == marca.uppercase()) {
                    val preciosOriginal = listadb((i).toString(), "original")
                    val preciosOled = listadb((i).toString(), "oled")
                    val preciosIncell = listadb((i).toString(), "incell")
                    val preciosCof = listadb((i).toString(), "cof")
                    val preciosCog = listadb((i).toString(), "cog")
                    val preciosTft = listadb((i).toString(), "tft")
                    preciosDb[0][aux] = preciosOriginal()
                    preciosDb[1][aux] = preciosOled()
                    preciosDb[2][aux] = preciosIncell()
                    preciosDb[3][aux] = preciosCof()
                    preciosDb[4][aux] = preciosCog()
                    preciosDb[5][aux] = preciosTft()
                    aux+=1
                }
            }
        }
        if(opcion == 2){
            val precios2Db = revisar(marca)
            aux = precios2Db.size
            for(i in 0 until aux){
                val preciosOriginal = listadb((precios2Db[i]).toString(), "original")
                val preciosOled = listadb((precios2Db[i]).toString(), "oled")
                val preciosIncell = listadb((precios2Db[i]).toString(), "incell")
                val preciosCof = listadb((precios2Db[i]).toString(), "cof")
                val preciosCog = listadb((precios2Db[i]).toString(), "cog")
                val preciosTft = listadb((precios2Db[i]).toString(), "tft")
                val preciosOriginalS: String = preciosOriginal()
                val preciosOledS: String = preciosOled()
                val preciosIncellS: String = preciosIncell()
                val preciosCofS: String = preciosCof()
                val preciosCogS: String = preciosCog()
                val preciosTftS: String = preciosTft()
                preciosDb[0][i] = preciosOriginalS
                preciosDb[1][i] = preciosOledS
                preciosDb[2][i] = preciosIncellS
                preciosDb[3][i] = preciosCofS
                preciosDb[4][i] = preciosCogS
                preciosDb[5][i] = preciosTftS
            }
        }
        return preciosDb
    }

    fun llenarModelo(opcion: Int, marca: String): Array<String?> {
        var modeloDb = arrayOfNulls<String?>(290)
        var aux = 0
        if(opcion == 1) {
            for (i in 0..290) {
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

fun llenarImages(opcion: Int, marca: String, tamano: Int):Array<Int?>{
        val imagesDb = arrayOfNulls<Int?>(tamano)
        if(opcion == 1){
            if (marca.uppercase() == "SAMSUNG"){
                for (i in 0 until tamano) {
                    imagesDb[i] = R.drawable.samsung
                }
            }
            if (marca.uppercase() == "APPLE"){
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
            if (marca.uppercase() == "MOTOROLA"){
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
            if (modeloMandarString == "APPLE"){
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
            if (modeloMandarString == "MOTOROLA"){
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

    fun llenarPrecios(opcion: Int, valorRequerido: Int, arregloPreciosDb: Array<Array<String?>> ): Array<String?> {

        val modeloDb = arrayOfNulls<String?>(6)
        val preciosDb = arrayOfNulls<String?>(6)
        val nombresDb= arrayOfNulls<String?>(6)
        var aux = 0
        preciosDb[0] = arregloPreciosDb[0][valorRequerido]
        preciosDb[1] = arregloPreciosDb[1][valorRequerido]
        preciosDb[2] = arregloPreciosDb[2][valorRequerido]
        preciosDb[3] = arregloPreciosDb[3][valorRequerido]
        preciosDb[4] = arregloPreciosDb[4][valorRequerido]
        preciosDb[5] = arregloPreciosDb[5][valorRequerido]
        nombresDb[0] = "Original\t\t\t\t\t" + arregloPreciosDb[0][valorRequerido]
        nombresDb[1] = "Oled\t\t\t\t\t\t\t\t" + arregloPreciosDb[1][valorRequerido]
        nombresDb[2] = "Incell\t\t\t\t\t\t\t" + arregloPreciosDb[2][valorRequerido]
        nombresDb[3] = "COF\t\t\t\t\t\t\t\t" + arregloPreciosDb[3][valorRequerido]
        nombresDb[4] = "COG\t\t\t\t\t\t\t\t" + arregloPreciosDb[4][valorRequerido]
        nombresDb[5] = "TFT\t\t\t\t\t\t\t\t" + arregloPreciosDb[5][valorRequerido]
        for (i in 0..5) {
            if (preciosDb[i] != "0") {
                modeloDb[aux] = nombresDb[i]
                aux += 1
            }
        }
        val preciosMandar = arrayOfNulls<String?>(aux)
        for (i in 0 until aux) {
            preciosMandar[i] = modeloDb[i]
        }

        return preciosMandar

    }

