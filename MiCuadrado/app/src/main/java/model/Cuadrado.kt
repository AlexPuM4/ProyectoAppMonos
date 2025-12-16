package model
open class Cuadrado (var color:Int, var ancho:Int, var alto:Int){
    //Coordenadas iniciales
    var x: Int=0
    var y: Int=0
    //métodos para mover-cambiar el cuadrado
    fun moverArriba(){
        y-= 10 //y= y-10
    }
    fun moverAbajo(){
        y+= 10 //y= y-10
    }
    fun moverDerecha(){
        x+= 10 //x= x+10
    }
    fun moverIzquierda(){
        x-= 10 //x= x-10
    }
    fun aumentarTamanio(){
        ancho += 10
        alto += 10
    }
    fun disminuirTamanio(){
        ancho -= 20
        alto -= 20
    }
}
