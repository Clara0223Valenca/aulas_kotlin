package com.example.aula07

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aula07.ui.theme.Aula07Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Aula07Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Layouts(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Layouts(modifier: Modifier = Modifier) {
    Column (
        // determina que é o tamanho total da tela
        modifier.fillMaxSize().background(Color.Yellow),
//        verticalArrangement = Arrangement.Bottom
//        verticalArrangement = Arrangement.Center
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Text(
            text =  "Primeiro texto",
            modifier =
                   Modifier.background(Color(84, 206, 192, 255))
                       .size(150.dp) //dp = pontos de densidade
                       .align(Alignment.CenterHorizontally)
                       .padding(16.dp,8.dp)
                       .border(2.dp, Color.Black)
        )
        Text("Segundo texto")

        Row(
            modifier = Modifier.fillMaxWidth()
                .height(100.dp)
                .padding(16.dp)
                .background(Color.Cyan),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(15.dp)
        ) {

            Button(onClick = {}) {
                Text("Botão 1")
            }

            Button(onClick = {}) {
                Text(
                    text = "Botão 2",
                    fontSize = 20.sp)
            }

            Column() {
                Text("texto interno 1")
                Text("texto interno 2")
            }
        }
        Text("terceiro texto")
    }

}
                                //mostra a tela inteira
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Aula07Theme {
        Layouts()
    }
}