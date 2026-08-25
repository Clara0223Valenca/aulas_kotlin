package com.example.aula5

import android.os.Bundle
//import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.text.font.FontFamily
//import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.aula5.ui.theme.Aula5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Aula5Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomeScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

//@Composable
//fun CustomText(text: String){
//
//    Text(
//        text = text,
//        color = Color(55, 109, 190, 255),
//        //itálico
//        fontStyle = FontStyle.Italic,
//        fontFamily = FontFamily.Cursive
//    )
//}

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    var displayName by remember {mutableStateOf("")}
    var typedName  by remember {mutableStateOf("")}
    var typedAge by remember { mutableStateOf("") }
    //o textFild sempre lê string, então tem que converter para toIntOrNull

    Column(
        modifier =modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text("Coloque seu nome: ")

        //área onde o usuário vai digitar alguma coisa
        TextField(
            value = typedName,//valor inicial
            onValueChange = {typedName = it}//função lambda -> o que fazer quando eu altero esse valor
        )

        Button(
            onClick = {
                displayName = typedName
                typedName = ""
            }
        ) {

            Text("Mostrar nome")
        }

        Text("Olá senhor(a) $displayName")

        var age = typedAge.toIntOrNull()
        if (age != null){
            if (age>18){
                Text("Maior de idade")
            }

        }

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Aula5Theme {
        HomeScreen()
    }
}