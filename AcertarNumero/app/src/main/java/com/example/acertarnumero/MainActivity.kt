package com.example.acertarnumero

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val numeroIntroducido: EditText = findViewById(R.id.entradaValor)
        val boton : Button = findViewById(R.id.miboto)
        val mensajeSalida: TextView = findViewById(R.id.salidaValor)
        var numeroAleatorio = Random.nextInt(1,101)
        var numIntentos : Int = 0
        boton.setOnClickListener {
            numIntentos++
            val valorIntroducido = numeroIntroducido.text.toString().toIntOrNull()
            if(valorIntroducido==null)mensajeSalida.text="Debe un valor"
            else if(numeroAleatorio<valorIntroducido) mensajeSalida.text="El numero es mas bajo"
            else if(numeroAleatorio>valorIntroducido) mensajeSalida.text="El numero es mas alto"
            else mensajeSalida.text="HAS ACERTADO en $numIntentos intentos"
        }
        }
    }
