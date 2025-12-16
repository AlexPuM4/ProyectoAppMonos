package com.example.projectotipomonos

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projectotipomonos.ui.patallas.FunctionInicio
import com.example.projectotipomonos.ui.patallas.PantallaInfo
import com.example.projectotipomonos.ui.theme.ProjectoTipoMonosTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjectoTipoMonosTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    MonosApp()
                }
            }
        }
    }
}
@Composable
fun MonosApp(){
    //Creamos un controlador de navegador
    val navController = rememberNavController()
    //creamos contenedor de navegacion
    NavHost(navController=navController, startDestination = "inicio"){
        composable("inicio"){FunctionInicio(navController)}
        composable("info"){PantallaInfo(navController)}
        composable("zoo"){PantallaZoo(navController)}
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProjectoTipoMonosTheme {
        Greeting("Android")
    }
}