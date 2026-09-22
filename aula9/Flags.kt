package com.example.aula9

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    val idImage1 = R.drawable.cabo_verde
    val idImage2 = R.drawable.tunisia
    var idDisplayedImage by remember { mutableStateOf(idImage1) }


    Column(
        modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


    ) {


        Image(
            painter = painterResource(idDisplayedImage),
            contentDescription = "imagem da bandeira de Cabo Verde", //obrigatório
            modifier = modifier.size(300.dp)
                .border(width = 1.dp, Color.Black)
        )


        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            Button(
                onClick = {
                    idDisplayedImage = idImage1
                }
            ) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Imagem 1")
                    Image(
                        painter = painterResource(R.drawable.cabo_verde),
                        contentDescription = "",
                        modifier.size(35.dp)
                    )
                }
            }


            Button(
                onClick = {
                    idDisplayedImage = idImage2
                }
            ) {
                Text("Imagem 2")
            }
        }


    }
}
