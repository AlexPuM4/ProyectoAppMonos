package model

import model.Cuadrado
import android.graphics.Color

class CuadradoBordes(color: Int, ancho: Int, alto: Int, var bordeColor: Int= Color.BLACK):Cuadrado(color,ancho,alto) {
    //metodo nuevo cambiarColorBorde
    fun cambiarColorBorde(nuevoColorBorde: Int) {
        bordeColor = nuevoColorBorde
    }

    //ejemplo de clase nested
    class ManejoColor {
        //Definimos un objeto comun a toda la clase que son los colores
        companion object {
            val ROJO = Color.RED
            val AZUL = Color.BLUE
            val VERDE = Color.GREEN
            val NEGRO = Color.BLACK


            //definimos el método de cambiar color
            fun obtener4ColoresAleatorios(): Int {
                //creamos una lista con los valores de companion object
                val colores = listOf(ROJO, AZUL, VERDE, NEGRO)
                return colores.random()
            }
        }
    }
}