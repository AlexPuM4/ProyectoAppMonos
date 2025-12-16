package com.example.projectotipomonos.ui.patallas

import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.projectotipomonos.MonosApp
import com.example.projectotipomonos.data.RepositorioMonos

@Composable
fun PantallaDetalleMonos (navController: NavController,id:Int){
    //creamos variable mono  donde almacenar el objeto mono que se tiene que cargar segun el id que recibimos
    //el mono está en el fichero de datos en un objeto mono en el objeto JaulaMonos
    val mono = RepositorioMonos.getMonoById(id)?:return
    Column (Modifier.fillMaxSize().padding(8.dp)){
        Button(onClick={navController.popBackStack()},
            Modifier.align(Alignment.Start)
        ){
            Text("Volver")
        }
        Spacer(Modifier.height(8.dp))
        Text(mono.nombre,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align (Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.height(12.dp))
        Box(modifier = Modifier.fillMaxSize().height(300.dp),
            contentAlignment = Alignment.Center){
            Image(painter = painterResource(id = mono.Imagen), contentDescription = mono.nombre)
        }
        Spacer(modifier = Modifier.height(12.dp))
        /*Button() {
            Text("cambiar color ")
        }*/
    }
}