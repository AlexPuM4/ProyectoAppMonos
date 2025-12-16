package com.example.projectotipomonos.ui.patallas

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.projectotipomonos.data.RepositorioMonos

@Composable
fun PantallaZoo(navController: NavHostController){
    //LazyColumn que ocupe el margen de 8
    LazyColumn (Modifier.fillMaxSize().padding(8.dp)){
        //empezamos a meter el elementos sacandolos de la lista
        items(RepositorioMonos.JaulaDeMonos.size){
            index:Int->val mono  = RepositorioMonos.JaulaDeMonos[index]
            //con cada elementos de la lista  meterlo en un Card
            Card(modifier = Modifier.padding(8.dp).fillMaxWidth().clickable{}){
                Row(Modifier.padding(8.dp)){
                    //dentro ponemos la imagen,nombre y descripcion
                    Image(painterResource(id = mono.Imagen),
                        contentDescription = mono.nombre,
                        Modifier.size(80.dp)
                    )
                    Spacer(Modifier.width(16.dp))
                    Column(Modifier.weight(1f)){
                        Text(mono.nombre, style = MaterialTheme.typography.titleLarge)
                        Text(mono.descripcion, maxLines = 1)
                    }
                }
            }
        }//Se cierra los items
        //boton tiene que estar de un item
        item {
            Spacer(Modifier.height(32.dp))
            Button(onClick = {navController.popBackStack()},
                Modifier.fillMaxWidth().padding(horizontal = 16.dp))
            {Text("Volver al inicio")}
        }
    }//Aqui se termina LazyColumn
}