package com.example.projectotipomonos.data

import com.example.projectotipomonos.R

data class Mono (val id:Int,val nombre:String,val Imagen:Int,val descripcion:String)
object RepositorioMonos{
    val JaulaDeMonos = listOf(
        Mono(1,"Mono drill", R.drawable.drill,"El Mono Drill es un primate ágil y persistente, equipado con un taladro que usa para perforar cualquier superficie"),
        Mono(2,"Titi Rojo",R.drawable.titi_rojizo,"El titi rojo es un pequeño primate ágil y territorial, reconocido por su pelaje rojizo brillante y su carácter alerta."),
        Mono(3,"Haporrinos",R.drawable.haporrinos,"Los haporrinos son criaturas robustas y compactas, reconocidas por su hocico prominente y su comportamiento altamente territorial."))
    //Funcion que devuelva el mono por id , si no existe ese mono que devuelva null
    /*fun getMonoById(id:Int):Mono?{
        for (mono in JaulaDeMonos){
            if(mono.id==id){
                return mono
            }
        }
        return null
    }*/
    fun getMonoById(id:Int):Mono?{
        return JaulaDeMonos.find{it.id==id}
    }
}